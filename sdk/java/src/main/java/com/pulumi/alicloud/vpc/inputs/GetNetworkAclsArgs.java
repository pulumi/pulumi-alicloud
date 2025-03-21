// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworkAclsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworkAclsArgs Empty = new GetNetworkAclsArgs();

    /**
     * A list of Network Acl ID.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of Network Acl ID.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * A regex string to filter results by Network Acl name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by Network Acl name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * The name of the network ACL.
     * 
     */
    @Import(name="networkAclName")
    private @Nullable Output<String> networkAclName;

    /**
     * @return The name of the network ACL.
     * 
     */
    public Optional<Output<String>> networkAclName() {
        return Optional.ofNullable(this.networkAclName);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The ID of the associated resource.
     * 
     */
    @Import(name="resourceId")
    private @Nullable Output<String> resourceId;

    /**
     * @return The ID of the associated resource.
     * 
     */
    public Optional<Output<String>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    /**
     * The type of the associated resource. Valid values `VSwitch`. `resource_type` and `resource_id` need to be specified at the same time to take effect.
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    /**
     * @return The type of the associated resource. Valid values `VSwitch`. `resource_type` and `resource_id` need to be specified at the same time to take effect.
     * 
     */
    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * The state of the network ACL. Valid values: `Available` and `Modifying`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The state of the network ACL. Valid values: `Available` and `Modifying`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The ID of the associated VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the associated VPC.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetNetworkAclsArgs() {}

    private GetNetworkAclsArgs(GetNetworkAclsArgs $) {
        this.ids = $.ids;
        this.nameRegex = $.nameRegex;
        this.networkAclName = $.networkAclName;
        this.outputFile = $.outputFile;
        this.resourceId = $.resourceId;
        this.resourceType = $.resourceType;
        this.status = $.status;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworkAclsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworkAclsArgs $;

        public Builder() {
            $ = new GetNetworkAclsArgs();
        }

        public Builder(GetNetworkAclsArgs defaults) {
            $ = new GetNetworkAclsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids A list of Network Acl ID.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Network Acl ID.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of Network Acl ID.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param nameRegex A regex string to filter results by Network Acl name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Network Acl name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        /**
         * @param networkAclName The name of the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder networkAclName(@Nullable Output<String> networkAclName) {
            $.networkAclName = networkAclName;
            return this;
        }

        /**
         * @param networkAclName The name of the network ACL.
         * 
         * @return builder
         * 
         */
        public Builder networkAclName(String networkAclName) {
            return networkAclName(Output.of(networkAclName));
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param resourceId The ID of the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(@Nullable Output<String> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        /**
         * @param resourceId The ID of the associated resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceId(String resourceId) {
            return resourceId(Output.of(resourceId));
        }

        /**
         * @param resourceType The type of the associated resource. Valid values `VSwitch`. `resource_type` and `resource_id` need to be specified at the same time to take effect.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType The type of the associated resource. Valid values `VSwitch`. `resource_type` and `resource_id` need to be specified at the same time to take effect.
         * 
         * @return builder
         * 
         */
        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param status The state of the network ACL. Valid values: `Available` and `Modifying`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The state of the network ACL. Valid values: `Available` and `Modifying`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param vpcId The ID of the associated VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the associated VPC.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public GetNetworkAclsArgs build() {
            return $;
        }
    }

}
