// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogTailConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogTailConfigArgs Empty = new LogTailConfigArgs();

    /**
     * The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
     * 
     */
    @Import(name="inputDetail", required=true)
    private Output<String> inputDetail;

    /**
     * @return The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
     * 
     */
    public Output<String> inputDetail() {
        return this.inputDetail;
    }

    /**
     * The input type. Currently only two types of files and plugin are supported.
     * 
     */
    @Import(name="inputType", required=true)
    private Output<String> inputType;

    /**
     * @return The input type. Currently only two types of files and plugin are supported.
     * 
     */
    public Output<String> inputType() {
        return this.inputType;
    }

    /**
     * The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
     * 
     */
    @Import(name="logSample")
    private @Nullable Output<String> logSample;

    /**
     * @return The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
     * 
     */
    public Optional<Output<String>> logSample() {
        return Optional.ofNullable(this.logSample);
    }

    /**
     * The log store name to the query index belongs.
     * 
     */
    @Import(name="logstore", required=true)
    private Output<String> logstore;

    /**
     * @return The log store name to the query index belongs.
     * 
     */
    public Output<String> logstore() {
        return this.logstore;
    }

    /**
     * The Logtail configuration name, which is unique in the same project.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The Logtail configuration name, which is unique in the same project.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The output type. Currently, only LogService is supported.
     * 
     */
    @Import(name="outputType", required=true)
    private Output<String> outputType;

    /**
     * @return The output type. Currently, only LogService is supported.
     * 
     */
    public Output<String> outputType() {
        return this.outputType;
    }

    /**
     * The project name to the log store belongs.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The project name to the log store belongs.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    private LogTailConfigArgs() {}

    private LogTailConfigArgs(LogTailConfigArgs $) {
        this.inputDetail = $.inputDetail;
        this.inputType = $.inputType;
        this.logSample = $.logSample;
        this.logstore = $.logstore;
        this.name = $.name;
        this.outputType = $.outputType;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogTailConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogTailConfigArgs $;

        public Builder() {
            $ = new LogTailConfigArgs();
        }

        public Builder(LogTailConfigArgs defaults) {
            $ = new LogTailConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputDetail The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
         * 
         * @return builder
         * 
         */
        public Builder inputDetail(Output<String> inputDetail) {
            $.inputDetail = inputDetail;
            return this;
        }

        /**
         * @param inputDetail The logtail configure the required JSON files. ([Refer to details](https://www.alibabacloud.com/help/doc-detail/29058.htm))
         * 
         * @return builder
         * 
         */
        public Builder inputDetail(String inputDetail) {
            return inputDetail(Output.of(inputDetail));
        }

        /**
         * @param inputType The input type. Currently only two types of files and plugin are supported.
         * 
         * @return builder
         * 
         */
        public Builder inputType(Output<String> inputType) {
            $.inputType = inputType;
            return this;
        }

        /**
         * @param inputType The input type. Currently only two types of files and plugin are supported.
         * 
         * @return builder
         * 
         */
        public Builder inputType(String inputType) {
            return inputType(Output.of(inputType));
        }

        /**
         * @param logSample The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder logSample(@Nullable Output<String> logSample) {
            $.logSample = logSample;
            return this;
        }

        /**
         * @param logSample The log sample of the Logtail configuration. The log size cannot exceed 1,000 bytes.
         * 
         * @return builder
         * 
         */
        public Builder logSample(String logSample) {
            return logSample(Output.of(logSample));
        }

        /**
         * @param logstore The log store name to the query index belongs.
         * 
         * @return builder
         * 
         */
        public Builder logstore(Output<String> logstore) {
            $.logstore = logstore;
            return this;
        }

        /**
         * @param logstore The log store name to the query index belongs.
         * 
         * @return builder
         * 
         */
        public Builder logstore(String logstore) {
            return logstore(Output.of(logstore));
        }

        /**
         * @param name The Logtail configuration name, which is unique in the same project.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The Logtail configuration name, which is unique in the same project.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param outputType The output type. Currently, only LogService is supported.
         * 
         * @return builder
         * 
         */
        public Builder outputType(Output<String> outputType) {
            $.outputType = outputType;
            return this;
        }

        /**
         * @param outputType The output type. Currently, only LogService is supported.
         * 
         * @return builder
         * 
         */
        public Builder outputType(String outputType) {
            return outputType(Output.of(outputType));
        }

        /**
         * @param project The project name to the log store belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The project name to the log store belongs.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public LogTailConfigArgs build() {
            if ($.inputDetail == null) {
                throw new MissingRequiredPropertyException("LogTailConfigArgs", "inputDetail");
            }
            if ($.inputType == null) {
                throw new MissingRequiredPropertyException("LogTailConfigArgs", "inputType");
            }
            if ($.logstore == null) {
                throw new MissingRequiredPropertyException("LogTailConfigArgs", "logstore");
            }
            if ($.outputType == null) {
                throw new MissingRequiredPropertyException("LogTailConfigArgs", "outputType");
            }
            if ($.project == null) {
                throw new MissingRequiredPropertyException("LogTailConfigArgs", "project");
            }
            return $;
        }
    }

}