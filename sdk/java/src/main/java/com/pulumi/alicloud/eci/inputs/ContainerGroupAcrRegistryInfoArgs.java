// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eci.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerGroupAcrRegistryInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerGroupAcrRegistryInfoArgs Empty = new ContainerGroupAcrRegistryInfoArgs();

    /**
     * The domain name of the ACR Enterprise Edition instance. Defaults to all domain names of the corresponding instance. Support specifying individual domain names, multiple separated by half comma.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return The domain name of the ACR Enterprise Edition instance. Defaults to all domain names of the corresponding instance. Support specifying individual domain names, multiple separated by half comma.
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * The ACR enterprise edition example ID.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The ACR enterprise edition example ID.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The name of the ACR enterprise edition instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return The name of the ACR enterprise edition instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * The ACR enterprise edition instance belongs to the region.
     * 
     */
    @Import(name="regionId")
    private @Nullable Output<String> regionId;

    /**
     * @return The ACR enterprise edition instance belongs to the region.
     * 
     */
    public Optional<Output<String>> regionId() {
        return Optional.ofNullable(this.regionId);
    }

    private ContainerGroupAcrRegistryInfoArgs() {}

    private ContainerGroupAcrRegistryInfoArgs(ContainerGroupAcrRegistryInfoArgs $) {
        this.domains = $.domains;
        this.instanceId = $.instanceId;
        this.instanceName = $.instanceName;
        this.regionId = $.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerGroupAcrRegistryInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerGroupAcrRegistryInfoArgs $;

        public Builder() {
            $ = new ContainerGroupAcrRegistryInfoArgs();
        }

        public Builder(ContainerGroupAcrRegistryInfoArgs defaults) {
            $ = new ContainerGroupAcrRegistryInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domains The domain name of the ACR Enterprise Edition instance. Defaults to all domain names of the corresponding instance. Support specifying individual domain names, multiple separated by half comma.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains The domain name of the ACR Enterprise Edition instance. Defaults to all domain names of the corresponding instance. Support specifying individual domain names, multiple separated by half comma.
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains The domain name of the ACR Enterprise Edition instance. Defaults to all domain names of the corresponding instance. Support specifying individual domain names, multiple separated by half comma.
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param instanceId The ACR enterprise edition example ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The ACR enterprise edition example ID.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceName The name of the ACR enterprise edition instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName The name of the ACR enterprise edition instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param regionId The ACR enterprise edition instance belongs to the region.
         * 
         * @return builder
         * 
         */
        public Builder regionId(@Nullable Output<String> regionId) {
            $.regionId = regionId;
            return this;
        }

        /**
         * @param regionId The ACR enterprise edition instance belongs to the region.
         * 
         * @return builder
         * 
         */
        public Builder regionId(String regionId) {
            return regionId(Output.of(regionId));
        }

        public ContainerGroupAcrRegistryInfoArgs build() {
            return $;
        }
    }

}