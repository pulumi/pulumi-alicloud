// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rocketmq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RocketMQInstanceSoftwareArgs extends com.pulumi.resources.ResourceArgs {

    public static final RocketMQInstanceSoftwareArgs Empty = new RocketMQInstanceSoftwareArgs();

    /**
     * Upgrade time period.
     * 
     */
    @Import(name="maintainTime")
    private @Nullable Output<String> maintainTime;

    /**
     * @return Upgrade time period.
     * 
     */
    public Optional<Output<String>> maintainTime() {
        return Optional.ofNullable(this.maintainTime);
    }

    /**
     * Software version.
     * 
     */
    @Import(name="softwareVersion")
    private @Nullable Output<String> softwareVersion;

    /**
     * @return Software version.
     * 
     */
    public Optional<Output<String>> softwareVersion() {
        return Optional.ofNullable(this.softwareVersion);
    }

    /**
     * Upgrade method.
     * 
     */
    @Import(name="upgradeMethod")
    private @Nullable Output<String> upgradeMethod;

    /**
     * @return Upgrade method.
     * 
     */
    public Optional<Output<String>> upgradeMethod() {
        return Optional.ofNullable(this.upgradeMethod);
    }

    private RocketMQInstanceSoftwareArgs() {}

    private RocketMQInstanceSoftwareArgs(RocketMQInstanceSoftwareArgs $) {
        this.maintainTime = $.maintainTime;
        this.softwareVersion = $.softwareVersion;
        this.upgradeMethod = $.upgradeMethod;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RocketMQInstanceSoftwareArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RocketMQInstanceSoftwareArgs $;

        public Builder() {
            $ = new RocketMQInstanceSoftwareArgs();
        }

        public Builder(RocketMQInstanceSoftwareArgs defaults) {
            $ = new RocketMQInstanceSoftwareArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maintainTime Upgrade time period.
         * 
         * @return builder
         * 
         */
        public Builder maintainTime(@Nullable Output<String> maintainTime) {
            $.maintainTime = maintainTime;
            return this;
        }

        /**
         * @param maintainTime Upgrade time period.
         * 
         * @return builder
         * 
         */
        public Builder maintainTime(String maintainTime) {
            return maintainTime(Output.of(maintainTime));
        }

        /**
         * @param softwareVersion Software version.
         * 
         * @return builder
         * 
         */
        public Builder softwareVersion(@Nullable Output<String> softwareVersion) {
            $.softwareVersion = softwareVersion;
            return this;
        }

        /**
         * @param softwareVersion Software version.
         * 
         * @return builder
         * 
         */
        public Builder softwareVersion(String softwareVersion) {
            return softwareVersion(Output.of(softwareVersion));
        }

        /**
         * @param upgradeMethod Upgrade method.
         * 
         * @return builder
         * 
         */
        public Builder upgradeMethod(@Nullable Output<String> upgradeMethod) {
            $.upgradeMethod = upgradeMethod;
            return this;
        }

        /**
         * @param upgradeMethod Upgrade method.
         * 
         * @return builder
         * 
         */
        public Builder upgradeMethod(String upgradeMethod) {
            return upgradeMethod(Output.of(upgradeMethod));
        }

        public RocketMQInstanceSoftwareArgs build() {
            return $;
        }
    }

}
