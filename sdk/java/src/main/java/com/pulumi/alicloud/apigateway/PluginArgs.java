// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PluginArgs extends com.pulumi.resources.ResourceArgs {

    public static final PluginArgs Empty = new PluginArgs();

    /**
     * The description of the plug-in, which cannot exceed 200 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the plug-in, which cannot exceed 200 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
     * 
     */
    @Import(name="pluginData", required=true)
    private Output<String> pluginData;

    /**
     * @return The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
     * 
     */
    public Output<String> pluginData() {
        return this.pluginData;
    }

    /**
     * The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
     * 
     */
    @Import(name="pluginName", required=true)
    private Output<String> pluginName;

    /**
     * @return The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
     * 
     */
    public Output<String> pluginName() {
        return this.pluginName;
    }

    /**
     * The type of the plug-in. Valid values:
     * - &#34;trafficControl&#34;
     * - &#34;ipControl&#34;
     * - &#34;backendSignature&#34;
     * - &#34;jwtAuth&#34;
     * - &#34;basicAuth&#34;
     * - &#34;cors&#34;
     * - &#34;caching&#34;
     * - &#34;routing&#34;
     * - &#34;accessControl&#34;
     * - &#34;errorMapping&#34;
     * - &#34;circuitBreaker&#34;
     * - &#34;remoteAuth&#34;
     * - &#34;logMask&#34;
     * - &#34;transformer&#34;.
     * 
     */
    @Import(name="pluginType", required=true)
    private Output<String> pluginType;

    /**
     * @return The type of the plug-in. Valid values:
     * - &#34;trafficControl&#34;
     * - &#34;ipControl&#34;
     * - &#34;backendSignature&#34;
     * - &#34;jwtAuth&#34;
     * - &#34;basicAuth&#34;
     * - &#34;cors&#34;
     * - &#34;caching&#34;
     * - &#34;routing&#34;
     * - &#34;accessControl&#34;
     * - &#34;errorMapping&#34;
     * - &#34;circuitBreaker&#34;
     * - &#34;remoteAuth&#34;
     * - &#34;logMask&#34;
     * - &#34;transformer&#34;.
     * 
     */
    public Output<String> pluginType() {
        return this.pluginType;
    }

    /**
     * The tag of the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private PluginArgs() {}

    private PluginArgs(PluginArgs $) {
        this.description = $.description;
        this.pluginData = $.pluginData;
        this.pluginName = $.pluginName;
        this.pluginType = $.pluginType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PluginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PluginArgs $;

        public Builder() {
            $ = new PluginArgs();
        }

        public Builder(PluginArgs defaults) {
            $ = new PluginArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the plug-in, which cannot exceed 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the plug-in, which cannot exceed 200 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param pluginData The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
         * 
         * @return builder
         * 
         */
        public Builder pluginData(Output<String> pluginData) {
            $.pluginData = pluginData;
            return this;
        }

        /**
         * @param pluginData The definition statement of the plug-in. Plug-in definition statements in the JSON and YAML formats are supported.
         * 
         * @return builder
         * 
         */
        public Builder pluginData(String pluginData) {
            return pluginData(Output.of(pluginData));
        }

        /**
         * @param pluginName The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
         * 
         * @return builder
         * 
         */
        public Builder pluginName(Output<String> pluginName) {
            $.pluginName = pluginName;
            return this;
        }

        /**
         * @param pluginName The name of the plug-in that you want to create. It can contain uppercase English letters, lowercase English letters, Chinese characters, numbers, and underscores (_). It must be 4 to 50 characters in length and cannot start with an underscore (_).
         * 
         * @return builder
         * 
         */
        public Builder pluginName(String pluginName) {
            return pluginName(Output.of(pluginName));
        }

        /**
         * @param pluginType The type of the plug-in. Valid values:
         * - &#34;trafficControl&#34;
         * - &#34;ipControl&#34;
         * - &#34;backendSignature&#34;
         * - &#34;jwtAuth&#34;
         * - &#34;basicAuth&#34;
         * - &#34;cors&#34;
         * - &#34;caching&#34;
         * - &#34;routing&#34;
         * - &#34;accessControl&#34;
         * - &#34;errorMapping&#34;
         * - &#34;circuitBreaker&#34;
         * - &#34;remoteAuth&#34;
         * - &#34;logMask&#34;
         * - &#34;transformer&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pluginType(Output<String> pluginType) {
            $.pluginType = pluginType;
            return this;
        }

        /**
         * @param pluginType The type of the plug-in. Valid values:
         * - &#34;trafficControl&#34;
         * - &#34;ipControl&#34;
         * - &#34;backendSignature&#34;
         * - &#34;jwtAuth&#34;
         * - &#34;basicAuth&#34;
         * - &#34;cors&#34;
         * - &#34;caching&#34;
         * - &#34;routing&#34;
         * - &#34;accessControl&#34;
         * - &#34;errorMapping&#34;
         * - &#34;circuitBreaker&#34;
         * - &#34;remoteAuth&#34;
         * - &#34;logMask&#34;
         * - &#34;transformer&#34;.
         * 
         * @return builder
         * 
         */
        public Builder pluginType(String pluginType) {
            return pluginType(Output.of(pluginType));
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public PluginArgs build() {
            if ($.pluginData == null) {
                throw new MissingRequiredPropertyException("PluginArgs", "pluginData");
            }
            if ($.pluginName == null) {
                throw new MissingRequiredPropertyException("PluginArgs", "pluginName");
            }
            if ($.pluginType == null) {
                throw new MissingRequiredPropertyException("PluginArgs", "pluginType");
            }
            return $;
        }
    }

}
