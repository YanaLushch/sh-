package com.shpp.p2p.cs.ylushch.assignment6.Assignment6Part2.teest;

public class FailureResult extends TeestResult {
    public static final FailureResult INSTANCE = new FailureResult();

    public ResultTypeHolder.ResultType getType() {
        return ResultTypeHolder.ResultType.FAILURE;
    }

    public String toString() {
        return "This test failed.  This means that there is a bug somewhere in your code.";
    }
}
