// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEcsInvocationsInvocationInvokeInstance {
    /**
     * @return The start time of the execution.
     * 
     */
    private final String creationTime;
    /**
     * @return The size of truncated and discarded text when the value of the Output response parameter exceeds 24 KB in size.
     * 
     */
    private final Integer dropped;
    private final String errorCode;
    /**
     * @return Details about the reason why the command failed to be sent or run.
     * 
     */
    private final String errorInfo;
    /**
     * @return The exit code of the execution.
     * 
     */
    private final Integer exitCode;
    /**
     * @return The end time of the execution.
     * 
     */
    private final String finishTime;
    /**
     * @return The ID of the instance.
     * 
     */
    private final String instanceId;
    private final String instanceInvokeStatus;
    /**
     * @return The execution state on a single instance. Valid values: `Pending`, `Scheduled`, `Running`, `Success`, `Failed`, `Stopping`, `Stopped`, `PartialFailed`.
     * 
     */
    private final String invocationStatus;
    /**
     * @return The output of the command.
     * 
     */
    private final String output;
    /**
     * @return The number of times that the command is run on the instance.
     * 
     */
    private final Integer repeats;
    /**
     * @return The time when the command started to be run on the instance.
     * 
     */
    private final String startTime;
    /**
     * @return The time when the command stopped being run on the instance. If you call the StopInvocation operation to manually stop the execution, the value is the time when you call the operation.
     * 
     */
    private final String stopTime;
    /**
     * @return Indicates whether the commands are to be automatically run.
     * * `error_code	` - The code that indicates why the command failed to be sent or run.
     * * `instance_invoke_status	` - **Note:** We recommend that you ignore this parameter and check the value of the `invocation_status` response parameter for the overall execution state.
     * 
     */
    private final Boolean timed;
    /**
     * @return The time when the execution state was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetEcsInvocationsInvocationInvokeInstance(
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("dropped") Integer dropped,
        @CustomType.Parameter("errorCode") String errorCode,
        @CustomType.Parameter("errorInfo") String errorInfo,
        @CustomType.Parameter("exitCode") Integer exitCode,
        @CustomType.Parameter("finishTime") String finishTime,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("instanceInvokeStatus") String instanceInvokeStatus,
        @CustomType.Parameter("invocationStatus") String invocationStatus,
        @CustomType.Parameter("output") String output,
        @CustomType.Parameter("repeats") Integer repeats,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("stopTime") String stopTime,
        @CustomType.Parameter("timed") Boolean timed,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.creationTime = creationTime;
        this.dropped = dropped;
        this.errorCode = errorCode;
        this.errorInfo = errorInfo;
        this.exitCode = exitCode;
        this.finishTime = finishTime;
        this.instanceId = instanceId;
        this.instanceInvokeStatus = instanceInvokeStatus;
        this.invocationStatus = invocationStatus;
        this.output = output;
        this.repeats = repeats;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.timed = timed;
        this.updateTime = updateTime;
    }

    /**
     * @return The start time of the execution.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The size of truncated and discarded text when the value of the Output response parameter exceeds 24 KB in size.
     * 
     */
    public Integer dropped() {
        return this.dropped;
    }
    public String errorCode() {
        return this.errorCode;
    }
    /**
     * @return Details about the reason why the command failed to be sent or run.
     * 
     */
    public String errorInfo() {
        return this.errorInfo;
    }
    /**
     * @return The exit code of the execution.
     * 
     */
    public Integer exitCode() {
        return this.exitCode;
    }
    /**
     * @return The end time of the execution.
     * 
     */
    public String finishTime() {
        return this.finishTime;
    }
    /**
     * @return The ID of the instance.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    public String instanceInvokeStatus() {
        return this.instanceInvokeStatus;
    }
    /**
     * @return The execution state on a single instance. Valid values: `Pending`, `Scheduled`, `Running`, `Success`, `Failed`, `Stopping`, `Stopped`, `PartialFailed`.
     * 
     */
    public String invocationStatus() {
        return this.invocationStatus;
    }
    /**
     * @return The output of the command.
     * 
     */
    public String output() {
        return this.output;
    }
    /**
     * @return The number of times that the command is run on the instance.
     * 
     */
    public Integer repeats() {
        return this.repeats;
    }
    /**
     * @return The time when the command started to be run on the instance.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return The time when the command stopped being run on the instance. If you call the StopInvocation operation to manually stop the execution, the value is the time when you call the operation.
     * 
     */
    public String stopTime() {
        return this.stopTime;
    }
    /**
     * @return Indicates whether the commands are to be automatically run.
     * * `error_code	` - The code that indicates why the command failed to be sent or run.
     * * `instance_invoke_status	` - **Note:** We recommend that you ignore this parameter and check the value of the `invocation_status` response parameter for the overall execution state.
     * 
     */
    public Boolean timed() {
        return this.timed;
    }
    /**
     * @return The time when the execution state was updated.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEcsInvocationsInvocationInvokeInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String creationTime;
        private Integer dropped;
        private String errorCode;
        private String errorInfo;
        private Integer exitCode;
        private String finishTime;
        private String instanceId;
        private String instanceInvokeStatus;
        private String invocationStatus;
        private String output;
        private Integer repeats;
        private String startTime;
        private String stopTime;
        private Boolean timed;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEcsInvocationsInvocationInvokeInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTime = defaults.creationTime;
    	      this.dropped = defaults.dropped;
    	      this.errorCode = defaults.errorCode;
    	      this.errorInfo = defaults.errorInfo;
    	      this.exitCode = defaults.exitCode;
    	      this.finishTime = defaults.finishTime;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceInvokeStatus = defaults.instanceInvokeStatus;
    	      this.invocationStatus = defaults.invocationStatus;
    	      this.output = defaults.output;
    	      this.repeats = defaults.repeats;
    	      this.startTime = defaults.startTime;
    	      this.stopTime = defaults.stopTime;
    	      this.timed = defaults.timed;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
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
        public Builder exitCode(Integer exitCode) {
            this.exitCode = Objects.requireNonNull(exitCode);
            return this;
        }
        public Builder finishTime(String finishTime) {
            this.finishTime = Objects.requireNonNull(finishTime);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceInvokeStatus(String instanceInvokeStatus) {
            this.instanceInvokeStatus = Objects.requireNonNull(instanceInvokeStatus);
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
        }
        public Builder timed(Boolean timed) {
            this.timed = Objects.requireNonNull(timed);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetEcsInvocationsInvocationInvokeInstance build() {
            return new GetEcsInvocationsInvocationInvokeInstance(creationTime, dropped, errorCode, errorInfo, exitCode, finishTime, instanceId, instanceInvokeStatus, invocationStatus, output, repeats, startTime, stopTime, timed, updateTime);
        }
    }
}