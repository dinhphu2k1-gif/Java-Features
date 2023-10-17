//package org.example;
//
//public class MultipleException {
//    public void oldMultiCatch() {
//        try {
//            methodThatThrowsThreeExceptions();
//        } catch (ExceptionOne e) {
//            // log and deal with ExceptionOne
//        } catch (ExceptionTwo e) {
//            // log and deal with ExceptionTwo
//        } catch (ExceptionThree e) {
//            // log and deal with ExceptionThree
//        }
//    }
//
//    public void newMultiCatch() {
//        try {
//            methodThatThrowsThreeExceptions();
//        } catch (ExceptionOne | ExceptionTwo | ExceptionThree e) {
//            // log and deal with all Exceptions
//        }
//    }
//}
