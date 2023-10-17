package org.example;

public class EnhanceInterface {
    private interface MyInterface{
        default void process1() {
            System.out.println("Do something");
        }

        static String process2() {
            return "Do someThing";
        }
    }

    private class MyClass implements MyInterface{
        @Override
        public void process1() {
            MyInterface.super.process1();
        }
    }

    public interface DBLogging{
        String MONGO_DB_NAME = "ABC_Mongo_Datastore";
        String NEO4J_DB_NAME = "ABC_Neo4J_Datastore";
        String CASSANDRA_DB_NAME = "ABC_Cassandra_Datastore";

        default void logInfo(String message){
//            Step1: Connect to DataStore
//            Setp2: Log Info Message
//            Setp3: Close the DataStore connection
        }
        default void logWarn(String message){
//            Step1: Connect to DataStore
//            Setp2: Log Warn Message
//            Setp3: Close the DataStore connection
        }
        default void logError(String message){
//            Step1: Connect to DataStore
//            Setp2: Log Error Message
//            Setp3: Close the DataStore connection
        }
        default void logFatal(String message){
//            Step1: Connect to DataStore
//            Setp2: Log Fatal Message
//            Setp3: Close the DataStore connection
        }
    }
}
