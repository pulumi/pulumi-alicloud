// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ActivationState extends com.pulumi.resources.ResourceArgs {

    public static final ActivationState Empty = new ActivationState();

    /**
     * The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The maximum number of times that the activation code can be used to register managed instances. Valid values: `1` to `1000`. Default value: `10`.
     * 
     */
    @Import(name="instanceCount")
    private @Nullable Output<Integer> instanceCount;

    /**
     * @return The maximum number of times that the activation code can be used to register managed instances. Valid values: `1` to `1000`. Default value: `10`.
     * 
     */
    public Optional<Output<Integer>> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }

    /**
     * The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).
     * - If you use the activation code created by the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
     * - If you specify InstanceName when you register a managed instance, an instance name in the format of `&lt;InstanceName&gt;-&lt;Number&gt;` is generated. The number of digits in the &lt;Number&gt; value is determined by that in the InstanceCount value. Example: 001. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).
     * - If you use the activation code created by the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
     * - If you specify InstanceName when you register a managed instance, an instance name in the format of `&lt;InstanceName&gt;-&lt;Number&gt;` is generated. The number of digits in the &lt;Number&gt; value is determined by that in the InstanceCount value. Example: 001. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
     * 
     */
    @Import(name="ipAddressRange")
    private @Nullable Output<String> ipAddressRange;

    /**
     * @return The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
     * 
     */
    public Optional<Output<String>> ipAddressRange() {
        return Optional.ofNullable(this.ipAddressRange);
    }

    /**
     * The validity period of the activation code. The activation code cannot be used to register new instances after the validity period expires. Unit: hours. Valid values: `1` to `24`. Default value: `4`.
     * 
     */
    @Import(name="timeToLiveInHours")
    private @Nullable Output<Integer> timeToLiveInHours;

    /**
     * @return The validity period of the activation code. The activation code cannot be used to register new instances after the validity period expires. Unit: hours. Valid values: `1` to `24`. Default value: `4`.
     * 
     */
    public Optional<Output<Integer>> timeToLiveInHours() {
        return Optional.ofNullable(this.timeToLiveInHours);
    }

    private ActivationState() {}

    private ActivationState(ActivationState $) {
        this.description = $.description;
        this.instanceCount = $.instanceCount;
        this.instanceName = $.instanceName;
        this.ipAddressRange = $.ipAddressRange;
        this.timeToLiveInHours = $.timeToLiveInHours;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivationState $;

        public Builder() {
            $ = new ActivationState();
        }

        public Builder(ActivationState defaults) {
            $ = new ActivationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceCount The maximum number of times that the activation code can be used to register managed instances. Valid values: `1` to `1000`. Default value: `10`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            $.instanceCount = instanceCount;
            return this;
        }

        /**
         * @param instanceCount The maximum number of times that the activation code can be used to register managed instances. Valid values: `1` to `1000`. Default value: `10`.
         * 
         * @return builder
         * 
         */
        public Builder instanceCount(Integer instanceCount) {
            return instanceCount(Output.of(instanceCount));
        }

        /**
         * @param instanceName The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).
         * - If you use the activation code created by the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
         * - If you specify InstanceName when you register a managed instance, an instance name in the format of `&lt;InstanceName&gt;-&lt;Number&gt;` is generated. The number of digits in the &lt;Number&gt; value is determined by that in the InstanceCount value. Example: 001. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).
         * - If you use the activation code created by the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
         * - If you specify InstanceName when you register a managed instance, an instance name in the format of `&lt;InstanceName&gt;-&lt;Number&gt;` is generated. The number of digits in the &lt;Number&gt; value is determined by that in the InstanceCount value. Example: 001. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param ipAddressRange The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressRange(@Nullable Output<String> ipAddressRange) {
            $.ipAddressRange = ipAddressRange;
            return this;
        }

        /**
         * @param ipAddressRange The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressRange(String ipAddressRange) {
            return ipAddressRange(Output.of(ipAddressRange));
        }

        /**
         * @param timeToLiveInHours The validity period of the activation code. The activation code cannot be used to register new instances after the validity period expires. Unit: hours. Valid values: `1` to `24`. Default value: `4`.
         * 
         * @return builder
         * 
         */
        public Builder timeToLiveInHours(@Nullable Output<Integer> timeToLiveInHours) {
            $.timeToLiveInHours = timeToLiveInHours;
            return this;
        }

        /**
         * @param timeToLiveInHours The validity period of the activation code. The activation code cannot be used to register new instances after the validity period expires. Unit: hours. Valid values: `1` to `24`. Default value: `4`.
         * 
         * @return builder
         * 
         */
        public Builder timeToLiveInHours(Integer timeToLiveInHours) {
            return timeToLiveInHours(Output.of(timeToLiveInHours));
        }

        public ActivationState build() {
            return $;
        }
    }

}
