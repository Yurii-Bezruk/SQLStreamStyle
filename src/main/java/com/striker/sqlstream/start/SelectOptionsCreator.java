package com.striker.sqlstream.start;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelectOptionsCreator {
    private static final String HIGH_PRIORITY = "HIGH_PRIORITY";
    private static final String STRAIGHT_JOIN = "STRAIGHT_JOIN";
    private static final String SQL_BIG_RESULT = "SQL_BIG_RESULT";
    private static final String SQL_SMALL_RESULT = "SQL_SMALL_RESULT";
    private static final String SQL_BUFFER_RESULT = "SQL_BUFFER_RESULT";
    private static final String DISTINCT = "DISTINCT";
    private static final String DISTINCTROW = "DISTINCTROW";
    private static final String ALL = "ALL";
    private static final List<String> commands = new ArrayList<String>(){{
        add(HIGH_PRIORITY);
        add(STRAIGHT_JOIN);
        add(SQL_BIG_RESULT);
        add(SQL_SMALL_RESULT);
        add(SQL_BUFFER_RESULT);
        add(DISTINCT);
//        add(DISTINCTROW);
//        add(ALL);
    }};
    private static final String HighPriorityOption = "HighPriorityOption";
    private static final String StraightJoinOption = "StraightJoinOption";
    private static final String SqlBigResultOption = "SqlBigResultOption";
    private static final String SqlSmallResultOption = "SqlSmallResultOption";
    private static final String SqlBufferResultOption = "SqlBufferResultOption";
    private static final String DistinctOption = "DistinctOption";
    private static final List<String> classes = new ArrayList<String>(){{
        add(HighPriorityOption);
        add(StraightJoinOption);
        add(SqlBigResultOption);
        add(SqlSmallResultOption);
        add(SqlBufferResultOption);
        add(DistinctOption);
    }};
    public static PrintWriter writer;
    public static void create(){
        try{
            writer = new PrintWriter("src/main/java/com/striker/sqlstream/help/SelectOptions.java");
            writer.println("package com.striker.sqlstream.help;\n");
            writer.println("public final class SelectOptions {");
            for (int i = 0; i < classes.size() - 1; i++) {
                writer.println("    public static "+classes.get(i)+" "+commands.get(i)+" = new "+classes.get(i)+"();");
            }
            writer.println(
                    "    public static DistinctOption DISTINCT = new DistinctOption(\""+DISTINCT+"\");\n" +
                            "    public static DistinctOption DISTINCTROW = new DistinctOption(\""+DISTINCTROW+"\");\n" +
                            "    public static DistinctOption ALL = new DistinctOption(\""+ALL+"\");\n" +
                            "    private SelectOptions(){}"
            );
            writer.println( "\n"+
                    "    public abstract static class SelectOption {\n" +
                    "        protected String name;\n" +
                    "        private SelectOption(String name) {\n" +
                    "            this.name = name;\n" +
                    "        }\n" +
                    "        public String getName() {\n" +
                    "            return name;\n" +
                    "        }\n" +
                    "    }"
            );
            printClasses(classes, commands, "",1, true);
            writer.println("}");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }

    private static String tabs(int N){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            builder.append("\t");
        }
        return builder.toString();
    }
    private static void printClasses(List<String> classes, List<String> commands, String getNameContent, int deep, boolean isStatic){
        if(classes.size() == 0)
            return;
        for (int i = 0; i < classes.size(); i++) {
            String staticPart = isStatic ? "static " : "";
            writer.println(tabs(deep)+"public "+staticPart+"class "+classes.get(i)+" extends SelectOption {");
            List<String> newClasses = new ArrayList<>(classes);
            List<String> newCommands = new ArrayList<>(commands);
            newClasses.remove(i);
            newCommands.remove(i);
            String newGetNameContent = commands.get(i).equals("DISTINCT") ?
                "\"+"+classes.get(i)+".this.getRealName()+\"" :
                    commands.get(i);
            newGetNameContent = getNameContent + newGetNameContent + " ";
            printFields(newClasses, newCommands, deep + 1);
            printClasses(newClasses, newCommands, newGetNameContent,deep + 1, false);
            if(classes.get(i).equals("DistinctOption")){
                writer.println(
                    tabs(deep + 1)+"public "+classes.get(i)+"(String name) {\n" +
                    tabs(deep + 1)+"    super(name);\n" +
                    tabs(deep + 1)+"}"
                );
            }
            else{
                writer.println(
                    tabs(deep + 1)+"public "+classes.get(i)+"() {\n" +
                    tabs(deep + 1)+"    super(\""+commands.get(i)+"\");\n" +
                    tabs(deep + 1)+"}"
                );
            }
            if(! getNameContent.equals("")){
                writer.println(
                    tabs(deep + 1)+"@Override\n" +
                    tabs(deep + 1)+"public String getName() {\n" +
                    tabs(deep + 1)+"    return \""+getNameContent +
                            (commands.get(i).equals("DISTINCT") ?
                            "\"+"+classes.get(i)+".this.getRealName()+\"" :
                            commands.get(i)) +
                            "\";\n" +
                    tabs(deep + 1)+"}"
                );
            }
            if(classes.get(i).equals("DistinctOption")){
                writer.println(
                    tabs(deep + 1)+"public String getRealName() {\n" +
                    tabs(deep + 1)+"    return this.name;\n" +
                    tabs(deep + 1)+"}"
                );
            }
            writer.println(tabs(deep)+"}");
        }
    }
    private static void printFields(List<String> classes, List<String> commands, int deep){
        if(classes.size() == 0)
            return;
        for (int i = 0; i < classes.size(); i++)  {
            if(classes.get(i).equals("DistinctOption")){
                writer.println(tabs(deep) + "public " + classes.get(i) + " DISTINCT = new " + classes.get(i) + "(\"DISTINCT\");");
                writer.println(tabs(deep) + "public " + classes.get(i) + " DISTINCTROW = new " + classes.get(i) + "(\"DISTINCTROW\");");
                writer.println(tabs(deep) + "public " + classes.get(i) + " ALL = new " + classes.get(i) + "(\"ALL\");");
            }
            else {
                writer.println(tabs(deep) + "public " + classes.get(i) + " " + commands.get(i) + " = new " + classes.get(i) + "();");
            }
        }
    }

    public static void main(String[] args) {
        create();
    }
}
