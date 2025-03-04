// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mse;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NacosConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final NacosConfigArgs Empty = new NacosConfigArgs();

    /**
     * The language type of the returned information. Valid values: `zh`, `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    /**
     * @return The language type of the returned information. Valid values: `zh`, `en`.
     * 
     */
    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="appName")
    private @Nullable Output<String> appName;

    /**
     * @return The name of the application.
     * 
     */
    public Optional<Output<String>> appName() {
        return Optional.ofNullable(this.appName);
    }

    /**
     * The list of IP addresses where the beta release of the configuration is performed.
     * 
     */
    @Import(name="betaIps")
    private @Nullable Output<String> betaIps;

    /**
     * @return The list of IP addresses where the beta release of the configuration is performed.
     * 
     */
    public Optional<Output<String>> betaIps() {
        return Optional.ofNullable(this.betaIps);
    }

    /**
     * The content of the configuration.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    /**
     * @return The content of the configuration.
     * 
     */
    public Output<String> content() {
        return this.content;
    }

    /**
     * The ID of the data.
     * 
     */
    @Import(name="dataId", required=true)
    private Output<String> dataId;

    /**
     * @return The ID of the data.
     * 
     */
    public Output<String> dataId() {
        return this.dataId;
    }

    /**
     * The description of the configuration.
     * 
     */
    @Import(name="desc")
    private @Nullable Output<String> desc;

    /**
     * @return The description of the configuration.
     * 
     */
    public Optional<Output<String>> desc() {
        return Optional.ofNullable(this.desc);
    }

    /**
     * The ID of the group.
     * 
     */
    @Import(name="group", required=true)
    private Output<String> group;

    /**
     * @return The ID of the group.
     * 
     */
    public Output<String> group() {
        return this.group;
    }

    /**
     * The ID of the instance.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return The ID of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`&#34;&#34;`* or just not set this parameter.
     * 
     */
    @Import(name="namespaceId")
    private @Nullable Output<String> namespaceId;

    /**
     * @return The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`&#34;&#34;`* or just not set this parameter.
     * 
     */
    public Optional<Output<String>> namespaceId() {
        return Optional.ofNullable(this.namespaceId);
    }

    /**
     * The tags of the configuration.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<String> tags;

    /**
     * @return The tags of the configuration.
     * 
     */
    public Optional<Output<String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The format of the configuration. Supported formats include TEXT, JSON, and XML.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The format of the configuration. Supported formats include TEXT, JSON, and XML.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private NacosConfigArgs() {}

    private NacosConfigArgs(NacosConfigArgs $) {
        this.acceptLanguage = $.acceptLanguage;
        this.appName = $.appName;
        this.betaIps = $.betaIps;
        this.content = $.content;
        this.dataId = $.dataId;
        this.desc = $.desc;
        this.group = $.group;
        this.instanceId = $.instanceId;
        this.namespaceId = $.namespaceId;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NacosConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NacosConfigArgs $;

        public Builder() {
            $ = new NacosConfigArgs();
        }

        public Builder(NacosConfigArgs defaults) {
            $ = new NacosConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceptLanguage The language type of the returned information. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * @param acceptLanguage The language type of the returned information. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        /**
         * @param appName The name of the application.
         * 
         * @return builder
         * 
         */
        public Builder appName(@Nullable Output<String> appName) {
            $.appName = appName;
            return this;
        }

        /**
         * @param appName The name of the application.
         * 
         * @return builder
         * 
         */
        public Builder appName(String appName) {
            return appName(Output.of(appName));
        }

        /**
         * @param betaIps The list of IP addresses where the beta release of the configuration is performed.
         * 
         * @return builder
         * 
         */
        public Builder betaIps(@Nullable Output<String> betaIps) {
            $.betaIps = betaIps;
            return this;
        }

        /**
         * @param betaIps The list of IP addresses where the beta release of the configuration is performed.
         * 
         * @return builder
         * 
         */
        public Builder betaIps(String betaIps) {
            return betaIps(Output.of(betaIps));
        }

        /**
         * @param content The content of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The content of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param dataId The ID of the data.
         * 
         * @return builder
         * 
         */
        public Builder dataId(Output<String> dataId) {
            $.dataId = dataId;
            return this;
        }

        /**
         * @param dataId The ID of the data.
         * 
         * @return builder
         * 
         */
        public Builder dataId(String dataId) {
            return dataId(Output.of(dataId));
        }

        /**
         * @param desc The description of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder desc(@Nullable Output<String> desc) {
            $.desc = desc;
            return this;
        }

        /**
         * @param desc The description of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder desc(String desc) {
            return desc(Output.of(desc));
        }

        /**
         * @param group The ID of the group.
         * 
         * @return builder
         * 
         */
        public Builder group(Output<String> group) {
            $.group = group;
            return this;
        }

        /**
         * @param group The ID of the group.
         * 
         * @return builder
         * 
         */
        public Builder group(String group) {
            return group(Output.of(group));
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param namespaceId The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`&#34;&#34;`* or just not set this parameter.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(@Nullable Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        /**
         * @param namespaceId The id of Namespace. If you want to create a config under the `public` namespace, this parameter can be set to an empty string  *`&#34;&#34;`* or just not set this parameter.
         * 
         * @return builder
         * 
         */
        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        /**
         * @param tags The tags of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the configuration.
         * 
         * @return builder
         * 
         */
        public Builder tags(String tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param type The format of the configuration. Supported formats include TEXT, JSON, and XML.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The format of the configuration. Supported formats include TEXT, JSON, and XML.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NacosConfigArgs build() {
            if ($.content == null) {
                throw new MissingRequiredPropertyException("NacosConfigArgs", "content");
            }
            if ($.dataId == null) {
                throw new MissingRequiredPropertyException("NacosConfigArgs", "dataId");
            }
            if ($.group == null) {
                throw new MissingRequiredPropertyException("NacosConfigArgs", "group");
            }
            if ($.instanceId == null) {
                throw new MissingRequiredPropertyException("NacosConfigArgs", "instanceId");
            }
            return $;
        }
    }

}
