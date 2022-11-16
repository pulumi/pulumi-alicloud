// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EipAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final EipAssociationState Empty = new EipAssociationState();

    /**
     * The allocation EIP ID.
     * 
     */
    @Import(name="allocationId")
    private @Nullable Output<String> allocationId;

    /**
     * @return The allocation EIP ID.
     * 
     */
    public Optional<Output<String>> allocationId() {
        return Optional.ofNullable(this.allocationId);
    }

    /**
     * When EIP is bound to a NAT gateway, and the NAT gateway adds a DNAT or SNAT entry, set it for `true` can unassociation any way. Default to `false`.
     * 
     */
    @Import(name="force")
    private @Nullable Output<Boolean> force;

    /**
     * @return When EIP is bound to a NAT gateway, and the NAT gateway adds a DNAT or SNAT entry, set it for `true` can unassociation any way. Default to `false`.
     * 
     */
    public Optional<Output<Boolean>> force() {
        return Optional.ofNullable(this.force);
    }

    /**
     * The ID of the ECS or SLB instance or Nat Gateway or NetworkInterface or HaVip.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ID of the ECS or SLB instance or Nat Gateway or NetworkInterface or HaVip.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The type of cloud product that the eip instance to bind. Valid values: `EcsInstance`, `SlbInstance`, `Nat`, `NetworkInterface` and `HaVip`.
     * 
     */
    @Import(name="instanceType")
    private @Nullable Output<String> instanceType;

    /**
     * @return The type of cloud product that the eip instance to bind. Valid values: `EcsInstance`, `SlbInstance`, `Nat`, `NetworkInterface` and `HaVip`.
     * 
     */
    public Optional<Output<String>> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * The private IP address in the network segment of the vswitch which has been assigned.
     * 
     */
    @Import(name="privateIpAddress")
    private @Nullable Output<String> privateIpAddress;

    /**
     * @return The private IP address in the network segment of the vswitch which has been assigned.
     * 
     */
    public Optional<Output<String>> privateIpAddress() {
        return Optional.ofNullable(this.privateIpAddress);
    }

    private EipAssociationState() {}

    private EipAssociationState(EipAssociationState $) {
        this.allocationId = $.allocationId;
        this.force = $.force;
        this.instanceId = $.instanceId;
        this.instanceType = $.instanceType;
        this.privateIpAddress = $.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EipAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EipAssociationState $;

        public Builder() {
            $ = new EipAssociationState();
        }

        public Builder(EipAssociationState defaults) {
            $ = new EipAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationId The allocation EIP ID.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(@Nullable Output<String> allocationId) {
            $.allocationId = allocationId;
            return this;
        }

        /**
         * @param allocationId The allocation EIP ID.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(String allocationId) {
            return allocationId(Output.of(allocationId));
        }

        /**
         * @param force When EIP is bound to a NAT gateway, and the NAT gateway adds a DNAT or SNAT entry, set it for `true` can unassociation any way. Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder force(@Nullable Output<Boolean> force) {
            $.force = force;
            return this;
        }

        /**
         * @param force When EIP is bound to a NAT gateway, and the NAT gateway adds a DNAT or SNAT entry, set it for `true` can unassociation any way. Default to `false`.
         * 
         * @return builder
         * 
         */
        public Builder force(Boolean force) {
            return force(Output.of(force));
        }

        /**
         * @param instanceId The ID of the ECS or SLB instance or Nat Gateway or NetworkInterface or HaVip.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ID of the ECS or SLB instance or Nat Gateway or NetworkInterface or HaVip.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceType The type of cloud product that the eip instance to bind. Valid values: `EcsInstance`, `SlbInstance`, `Nat`, `NetworkInterface` and `HaVip`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param instanceType The type of cloud product that the eip instance to bind. Valid values: `EcsInstance`, `SlbInstance`, `Nat`, `NetworkInterface` and `HaVip`.
         * 
         * @return builder
         * 
         */
        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        /**
         * @param privateIpAddress The private IP address in the network segment of the vswitch which has been assigned.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            $.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * @param privateIpAddress The private IP address in the network segment of the vswitch which has been assigned.
         * 
         * @return builder
         * 
         */
        public Builder privateIpAddress(String privateIpAddress) {
            return privateIpAddress(Output.of(privateIpAddress));
        }

        public EipAssociationState build() {
            return $;
        }
    }

}