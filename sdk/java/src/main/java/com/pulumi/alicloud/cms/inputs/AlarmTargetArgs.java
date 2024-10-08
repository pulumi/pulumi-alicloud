// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlarmTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlarmTargetArgs Empty = new AlarmTargetArgs();

    /**
     * ARN uniquely identifies the resource that the alert targets.
     * &gt; **NOTE:** The targets attribute is used to specify where notifications or actions should be directed when an alarm condition is met. This attribute corresponds to what is referred to as the &#34;Push Channel&#34; in the Alibaba Cloud console.
     * **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN uniquely identifies the resource that the alert targets.
     * &gt; **NOTE:** The targets attribute is used to specify where notifications or actions should be directed when an alarm condition is met. This attribute corresponds to what is referred to as the &#34;Push Channel&#34; in the Alibaba Cloud console.
     * **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Specifies additional parameters for the alert callback in JSON format. This can include configuration settings specific to the alert action.
     * 
     */
    @Import(name="jsonParams")
    private @Nullable Output<String> jsonParams;

    /**
     * @return Specifies additional parameters for the alert callback in JSON format. This can include configuration settings specific to the alert action.
     * 
     */
    public Optional<Output<String>> jsonParams() {
        return Optional.ofNullable(this.jsonParams);
    }

    /**
     * The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    @Import(name="level")
    private @Nullable Output<String> level;

    /**
     * @return The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
     * 
     */
    public Optional<Output<String>> level() {
        return Optional.ofNullable(this.level);
    }

    /**
     * The ID of the resource for which alerts are triggered. This is typically used to specify individual resources that should respond to the alert.
     * 
     */
    @Import(name="targetId")
    private @Nullable Output<String> targetId;

    /**
     * @return The ID of the resource for which alerts are triggered. This is typically used to specify individual resources that should respond to the alert.
     * 
     */
    public Optional<Output<String>> targetId() {
        return Optional.ofNullable(this.targetId);
    }

    private AlarmTargetArgs() {}

    private AlarmTargetArgs(AlarmTargetArgs $) {
        this.arn = $.arn;
        this.jsonParams = $.jsonParams;
        this.level = $.level;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlarmTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlarmTargetArgs $;

        public Builder() {
            $ = new AlarmTargetArgs();
        }

        public Builder(AlarmTargetArgs defaults) {
            $ = new AlarmTargetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN uniquely identifies the resource that the alert targets.
         * &gt; **NOTE:** The targets attribute is used to specify where notifications or actions should be directed when an alarm condition is met. This attribute corresponds to what is referred to as the &#34;Push Channel&#34; in the Alibaba Cloud console.
         * **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN uniquely identifies the resource that the alert targets.
         * &gt; **NOTE:** The targets attribute is used to specify where notifications or actions should be directed when an alarm condition is met. This attribute corresponds to what is referred to as the &#34;Push Channel&#34; in the Alibaba Cloud console.
         * **NOTE:** Currently, the Alibaba Cloud Resource Name (ARN) of the resource. To use, please [submit an application](https://www.alibabacloud.com/help/en/cloudmonitor/latest/describemetricruletargets).
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param jsonParams Specifies additional parameters for the alert callback in JSON format. This can include configuration settings specific to the alert action.
         * 
         * @return builder
         * 
         */
        public Builder jsonParams(@Nullable Output<String> jsonParams) {
            $.jsonParams = jsonParams;
            return this;
        }

        /**
         * @param jsonParams Specifies additional parameters for the alert callback in JSON format. This can include configuration settings specific to the alert action.
         * 
         * @return builder
         * 
         */
        public Builder jsonParams(String jsonParams) {
            return jsonParams(Output.of(jsonParams));
        }

        /**
         * @param level The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
         * 
         * @return builder
         * 
         */
        public Builder level(@Nullable Output<String> level) {
            $.level = level;
            return this;
        }

        /**
         * @param level The level of the alert. Valid values: `Critical`, `Warn`, `Info`.
         * 
         * @return builder
         * 
         */
        public Builder level(String level) {
            return level(Output.of(level));
        }

        /**
         * @param targetId The ID of the resource for which alerts are triggered. This is typically used to specify individual resources that should respond to the alert.
         * 
         * @return builder
         * 
         */
        public Builder targetId(@Nullable Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The ID of the resource for which alerts are triggered. This is typically used to specify individual resources that should respond to the alert.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public AlarmTargetArgs build() {
            return $;
        }
    }

}
