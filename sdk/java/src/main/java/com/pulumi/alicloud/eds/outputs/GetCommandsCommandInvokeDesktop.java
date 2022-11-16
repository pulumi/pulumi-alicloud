// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCommandsCommandInvokeDesktop {
    /**
     * @return The desktop id of the Desktop.
     * 
     */
    private final String desktopId;
    /**
     * @return Output Field Text Length Exceeds 24 KB of Truncated Discarded Text Length.
     * 
     */
    private final Integer dropped;
    /**
     * @return Command of the Failure Or Perform the Reason for the Failure of the Code.
     * 
     */
    private final String errorCode;
    /**
     * @return Command of the Failure Or Perform the Reason for the Failure of the Details.
     * 
     */
    private final String errorInfo;
    /**
     * @return Command of the Failure Or Perform the Reason for the Failure of the Details.
     * 
     */
    private final String exitCode;
    /**
     * @return The Script Process until the End of Time.
     * 
     */
    private final String finishTime;
    /**
     * @return A Single Cloud Desktop Script Progress Status.
     * 
     */
    private final String invocationStatus;
    /**
     * @return Script the Output of the Process.
     * 
     */
    private final String output;
    /**
     * @return Command in the Desktop Implementation.
     * 
     */
    private final Integer repeats;
    /**
     * @return The Script Process on the Desktop, in the Start Timing of the Execution.
     * 
     */
    private final String startTime;
    /**
     * @return If You Use the invocation Indicates That the Call of the Time.
     * 
     */
    private final String stopTime;

    @CustomType.Constructor
    private GetCommandsCommandInvokeDesktop(
        @CustomType.Parameter("desktopId") String desktopId,
        @CustomType.Parameter("dropped") Integer dropped,
        @CustomType.Parameter("errorCode") String errorCode,
        @CustomType.Parameter("errorInfo") String errorInfo,
        @CustomType.Parameter("exitCode") String exitCode,
        @CustomType.Parameter("finishTime") String finishTime,
        @CustomType.Parameter("invocationStatus") String invocationStatus,
        @CustomType.Parameter("output") String output,
        @CustomType.Parameter("repeats") Integer repeats,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("stopTime") String stopTime) {
        this.desktopId = desktopId;
        this.dropped = dropped;
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
        this.exitCode = exitCode;
        this.finishTime = finishTime;
        this.invocationStatus = invocationStatus;
        this.output = output;
        this.repeats = repeats;
        this.startTime = startTime;
        this.stopTime = stopTime;
    }

    /**
     * @return The desktop id of the Desktop.
     * 
     */
    public String desktopId() {
        return this.desktopId;
    }
    /**
     * @return Output Field Text Length Exceeds 24 KB of Truncated Discarded Text Length.
     * 
     */
    public Integer dropped() {
        return this.dropped;
    }
    /**
     * @return Command of the Failure Or Perform the Reason for the Failure of the Code.
     * 
     */
    public String errorCode() {
        return this.errorCode;
    }
    /**
     * @return Command of the Failure Or Perform the Reason for the Failure of the Details.
     * 
     */
    public String errorInfo() {
        return this.errorInfo;
    }
    /**
     * @return Command of the Failure Or Perform the Reason for the Failure of the Details.
     * 
     */
    public String exitCode() {
        return this.exitCode;
    }
    /**
     * @return The Script Process until the End of Time.
     * 
     */
    public String finishTime() {
        return this.finishTime;
    }
    /**
     * @return A Single Cloud Desktop Script Progress Status.
     * 
     */
    public String invocationStatus() {
        return this.invocationStatus;
    }
    /**
     * @return Script the Output of the Process.
     * 
     */
    public String output() {
        return this.output;
    }
    /**
     * @return Command in the Desktop Implementation.
     * 
     */
    public Integer repeats() {
        return this.repeats;
    }
    /**
     * @return The Script Process on the Desktop, in the Start Timing of the Execution.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return If You Use the invocation Indicates That the Call of the Time.
     * 
     */
    public String stopTime() {
        return this.stopTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCommandsCommandInvokeDesktop defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String desktopId;
        private Integer dropped;
        private String errorCode;
        private String errorInfo;
        private String exitCode;
        private String finishTime;
        private String invocationStatus;
        private String output;
        private Integer repeats;
        private String startTime;
        private String stopTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCommandsCommandInvokeDesktop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desktopId = defaults.desktopId;
    	      this.dropped = defaults.dropped;
    	      this.errorCode = defaults.errorCode;
    	      this.errorInfo = defaults.errorInfo;
    	      this.exitCode = defaults.exitCode;
    	      this.finishTime = defaults.finishTime;
    	      this.invocationStatus = defaults.invocationStatus;
    	      this.output = defaults.output;
    	      this.repeats = defaults.repeats;
    	      this.startTime = defaults.startTime;
    	      this.stopTime = defaults.stopTime;
        }

        public Builder desktopId(String desktopId) {
            this.desktopId = Objects.requireNonNull(desktopId);
            return this;
        }
        public Builder dropped(Integer dropped) {
            this.dropped = Objects.requireNonNull(dropped);
            return this;
        }
        public Builder errorCode(String errorCode) {
            this.errorCode = Objects.requireNonNull(errorCode);
            return this;
        }
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = Objects.requireNonNull(errorInfo);
            return this;
        }
        public Builder exitCode(String exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }
        public Builder finishTime(String finishTime) {
            this.finishTime = Objects.requireNonNull(finishTime);
            return this;
        }
        public Builder invocationStatus(String invocationStatus) {
            this.invocationStatus = Objects.requireNonNull(invocationStatus);
            return this;
        }
        public Builder output(String output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder repeats(Integer repeats) {
            this.repeats = Objects.requireNonNull(repeats);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder stopTime(String stopTime) {
            this.stopTime = Objects.requireNonNull(stopTime);
            return this;
        }        public GetCommandsCommandInvokeDesktop build() {
            return new GetCommandsCommandInvokeDesktop(desktopId, dropped, errorCode, errorInfo, exitCode, finishTime, invocationStatus, output, repeats, startTime, stopTime);
        }
    }
}