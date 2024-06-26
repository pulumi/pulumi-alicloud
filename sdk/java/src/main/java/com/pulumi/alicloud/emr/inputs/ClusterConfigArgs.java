// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class ClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterConfigArgs Empty = new ClusterConfigArgs();

    @Import(name="configKey", required=true)
    private Output<String> configKey;

    public Output<String> configKey() {
        return this.configKey;
    }

    @Import(name="configValue", required=true)
    private Output<String> configValue;

    public Output<String> configValue() {
        return this.configValue;
    }

    @Import(name="fileName", required=true)
    private Output<String> fileName;

    public Output<String> fileName() {
        return this.fileName;
    }

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private ClusterConfigArgs() {}

    private ClusterConfigArgs(ClusterConfigArgs $) {
        this.configKey = $.configKey;
        this.configValue = $.configValue;
        this.fileName = $.fileName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigArgs $;

        public Builder() {
            $ = new ClusterConfigArgs();
        }

        public Builder(ClusterConfigArgs defaults) {
            $ = new ClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder configKey(Output<String> configKey) {
            $.configKey = configKey;
            return this;
        }

        public Builder configKey(String configKey) {
            return configKey(Output.of(configKey));
        }

        public Builder configValue(Output<String> configValue) {
            $.configValue = configValue;
            return this;
        }

        public Builder configValue(String configValue) {
            return configValue(Output.of(configValue));
        }

        public Builder fileName(Output<String> fileName) {
            $.fileName = fileName;
            return this;
        }

        public Builder fileName(String fileName) {
            return fileName(Output.of(fileName));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public ClusterConfigArgs build() {
            if ($.configKey == null) {
                throw new MissingRequiredPropertyException("ClusterConfigArgs", "configKey");
            }
            if ($.configValue == null) {
                throw new MissingRequiredPropertyException("ClusterConfigArgs", "configValue");
            }
            if ($.fileName == null) {
                throw new MissingRequiredPropertyException("ClusterConfigArgs", "fileName");
            }
            if ($.serviceName == null) {
                throw new MissingRequiredPropertyException("ClusterConfigArgs", "serviceName");
            }
            return $;
        }
    }

}
