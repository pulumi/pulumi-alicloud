// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.alicloud.cms.inputs.SlsGroupSlsGroupConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SlsGroupState extends com.pulumi.resources.ResourceArgs {

    public static final SlsGroupState Empty = new SlsGroupState();

    /**
     * The Config of the Sls Group. You can specify up to 25 Config. See `sls_group_config` below.
     * 
     */
    @Import(name="slsGroupConfigs")
    private @Nullable Output<List<SlsGroupSlsGroupConfigArgs>> slsGroupConfigs;

    /**
     * @return The Config of the Sls Group. You can specify up to 25 Config. See `sls_group_config` below.
     * 
     */
    public Optional<Output<List<SlsGroupSlsGroupConfigArgs>>> slsGroupConfigs() {
        return Optional.ofNullable(this.slsGroupConfigs);
    }

    /**
     * The Description of the Sls Group.
     * 
     */
    @Import(name="slsGroupDescription")
    private @Nullable Output<String> slsGroupDescription;

    /**
     * @return The Description of the Sls Group.
     * 
     */
    public Optional<Output<String>> slsGroupDescription() {
        return Optional.ofNullable(this.slsGroupDescription);
    }

    /**
     * The name of the resource. The name must be `2` to `32` characters in length, and can contain letters, digits and underscores (_). It must start with a letter.
     * 
     */
    @Import(name="slsGroupName")
    private @Nullable Output<String> slsGroupName;

    /**
     * @return The name of the resource. The name must be `2` to `32` characters in length, and can contain letters, digits and underscores (_). It must start with a letter.
     * 
     */
    public Optional<Output<String>> slsGroupName() {
        return Optional.ofNullable(this.slsGroupName);
    }

    private SlsGroupState() {}

    private SlsGroupState(SlsGroupState $) {
        this.slsGroupConfigs = $.slsGroupConfigs;
        this.slsGroupDescription = $.slsGroupDescription;
        this.slsGroupName = $.slsGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SlsGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsGroupState $;

        public Builder() {
            $ = new SlsGroupState();
        }

        public Builder(SlsGroupState defaults) {
            $ = new SlsGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param slsGroupConfigs The Config of the Sls Group. You can specify up to 25 Config. See `sls_group_config` below.
         * 
         * @return builder
         * 
         */
        public Builder slsGroupConfigs(@Nullable Output<List<SlsGroupSlsGroupConfigArgs>> slsGroupConfigs) {
            $.slsGroupConfigs = slsGroupConfigs;
            return this;
        }

        /**
         * @param slsGroupConfigs The Config of the Sls Group. You can specify up to 25 Config. See `sls_group_config` below.
         * 
         * @return builder
         * 
         */
        public Builder slsGroupConfigs(List<SlsGroupSlsGroupConfigArgs> slsGroupConfigs) {
            return slsGroupConfigs(Output.of(slsGroupConfigs));
        }

        /**
         * @param slsGroupConfigs The Config of the Sls Group. You can specify up to 25 Config. See `sls_group_config` below.
         * 
         * @return builder
         * 
         */
        public Builder slsGroupConfigs(SlsGroupSlsGroupConfigArgs... slsGroupConfigs) {
            return slsGroupConfigs(List.of(slsGroupConfigs));
        }

        /**
         * @param slsGroupDescription The Description of the Sls Group.
         * 
         * @return builder
         * 
         */
        public Builder slsGroupDescription(@Nullable Output<String> slsGroupDescription) {
            $.slsGroupDescription = slsGroupDescription;
            return this;
        }

        /**
         * @param slsGroupDescription The Description of the Sls Group.
         * 
         * @return builder
         * 
         */
        public Builder slsGroupDescription(String slsGroupDescription) {
            return slsGroupDescription(Output.of(slsGroupDescription));
        }

        /**
         * @param slsGroupName The name of the resource. The name must be `2` to `32` characters in length, and can contain letters, digits and underscores (_). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder slsGroupName(@Nullable Output<String> slsGroupName) {
            $.slsGroupName = slsGroupName;
            return this;
        }

        /**
         * @param slsGroupName The name of the resource. The name must be `2` to `32` characters in length, and can contain letters, digits and underscores (_). It must start with a letter.
         * 
         * @return builder
         * 
         */
        public Builder slsGroupName(String slsGroupName) {
            return slsGroupName(Output.of(slsGroupName));
        }

        public SlsGroupState build() {
            return $;
        }
    }

}