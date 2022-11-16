// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.inputs;

import com.pulumi.alicloud.vpc.inputs.DhcpOptionsSetAssociateVpcArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DhcpOptionsSetState extends com.pulumi.resources.ResourceArgs {

    public static final DhcpOptionsSetState Empty = new DhcpOptionsSetState();

    /**
     * AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10. Field `associate_vpcs` has been deprecated from provider version 1.153.0. It will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
     * 
     * @deprecated
     * Field &#39;associate_vpcs&#39; has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
     * 
     */
    @Deprecated /* Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. */
    @Import(name="associateVpcs")
    private @Nullable Output<List<DhcpOptionsSetAssociateVpcArgs>> associateVpcs;

    /**
     * @return AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10. Field `associate_vpcs` has been deprecated from provider version 1.153.0. It will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
     * 
     * @deprecated
     * Field &#39;associate_vpcs&#39; has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
     * 
     */
    @Deprecated /* Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. */
    public Optional<Output<List<DhcpOptionsSetAssociateVpcArgs>>> associateVpcs() {
        return Optional.ofNullable(this.associateVpcs);
    }

    /**
     * The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="dhcpOptionsSetDescription")
    private @Nullable Output<String> dhcpOptionsSetDescription;

    /**
     * @return The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> dhcpOptionsSetDescription() {
        return Optional.ofNullable(this.dhcpOptionsSetDescription);
    }

    /**
     * The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
     * 
     */
    @Import(name="dhcpOptionsSetName")
    private @Nullable Output<String> dhcpOptionsSetName;

    /**
     * @return The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
     * 
     */
    public Optional<Output<String>> dhcpOptionsSetName() {
        return Optional.ofNullable(this.dhcpOptionsSetName);
    }

    /**
     * The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
     * 
     */
    @Import(name="domainNameServers")
    private @Nullable Output<String> domainNameServers;

    /**
     * @return The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
     * 
     */
    public Optional<Output<String>> domainNameServers() {
        return Optional.ofNullable(this.domainNameServers);
    }

    /**
     * Specifies whether to precheck this request only. Valid values: `true` or `false`.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return Specifies whether to precheck this request only. Valid values: `true` or `false`.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * The ID of the account to which the DHCP options set belongs.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The ID of the account to which the DHCP options set belongs.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private DhcpOptionsSetState() {}

    private DhcpOptionsSetState(DhcpOptionsSetState $) {
        this.associateVpcs = $.associateVpcs;
        this.dhcpOptionsSetDescription = $.dhcpOptionsSetDescription;
        this.dhcpOptionsSetName = $.dhcpOptionsSetName;
        this.domainName = $.domainName;
        this.domainNameServers = $.domainNameServers;
        this.dryRun = $.dryRun;
        this.ownerId = $.ownerId;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DhcpOptionsSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DhcpOptionsSetState $;

        public Builder() {
            $ = new DhcpOptionsSetState();
        }

        public Builder(DhcpOptionsSetState defaults) {
            $ = new DhcpOptionsSetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param associateVpcs AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10. Field `associate_vpcs` has been deprecated from provider version 1.153.0. It will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;associate_vpcs&#39; has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
         * 
         */
        @Deprecated /* Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. */
        public Builder associateVpcs(@Nullable Output<List<DhcpOptionsSetAssociateVpcArgs>> associateVpcs) {
            $.associateVpcs = associateVpcs;
            return this;
        }

        /**
         * @param associateVpcs AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10. Field `associate_vpcs` has been deprecated from provider version 1.153.0. It will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;associate_vpcs&#39; has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
         * 
         */
        @Deprecated /* Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. */
        public Builder associateVpcs(List<DhcpOptionsSetAssociateVpcArgs> associateVpcs) {
            return associateVpcs(Output.of(associateVpcs));
        }

        /**
         * @param associateVpcs AssociateVpcs. Number of VPCs that can be associated with each DHCP options set is 10. Field `associate_vpcs` has been deprecated from provider version 1.153.0. It will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
         * 
         * @return builder
         * 
         * @deprecated
         * Field &#39;associate_vpcs&#39; has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource &#39;alicloud_vpc_dhcp_options_set_attachment&#39; to attach DhcpOptionsSet and Vpc.
         * 
         */
        @Deprecated /* Field 'associate_vpcs' has been deprecated from provider version 1.153.0 and it will be removed in the future version. Please use the new resource 'alicloud_vpc_dhcp_options_set_attachment' to attach DhcpOptionsSet and Vpc. */
        public Builder associateVpcs(DhcpOptionsSetAssociateVpcArgs... associateVpcs) {
            return associateVpcs(List.of(associateVpcs));
        }

        /**
         * @param dhcpOptionsSetDescription The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetDescription(@Nullable Output<String> dhcpOptionsSetDescription) {
            $.dhcpOptionsSetDescription = dhcpOptionsSetDescription;
            return this;
        }

        /**
         * @param dhcpOptionsSetDescription The description of the DHCP options set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetDescription(String dhcpOptionsSetDescription) {
            return dhcpOptionsSetDescription(Output.of(dhcpOptionsSetDescription));
        }

        /**
         * @param dhcpOptionsSetName The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetName(@Nullable Output<String> dhcpOptionsSetName) {
            $.dhcpOptionsSetName = dhcpOptionsSetName;
            return this;
        }

        /**
         * @param dhcpOptionsSetName The name of the DHCP options set. The name must be 2 to 128 characters in length and can contain letters, Chinese characters, digits, underscores (_), and hyphens (-). It must start with a letter or a Chinese character.
         * 
         * @return builder
         * 
         */
        public Builder dhcpOptionsSetName(String dhcpOptionsSetName) {
            return dhcpOptionsSetName(Output.of(dhcpOptionsSetName));
        }

        /**
         * @param domainName The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The root domain, for example, example.com. After a DHCP options set is associated with a Virtual Private Cloud (VPC) network, the root domain in the DHCP options set is automatically synchronized to the ECS instances in the VPC network.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param domainNameServers The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
         * 
         * @return builder
         * 
         */
        public Builder domainNameServers(@Nullable Output<String> domainNameServers) {
            $.domainNameServers = domainNameServers;
            return this;
        }

        /**
         * @param domainNameServers The DNS server IP addresses. Up to four DNS server IP addresses can be specified. IP addresses must be separated with commas (,).Before you specify any DNS server IP address, all ECS instances in the associated VPC network use the IP addresses of the Alibaba Cloud DNS servers, which are `100.100.2.136` and `100.100.2.138`.
         * 
         * @return builder
         * 
         */
        public Builder domainNameServers(String domainNameServers) {
            return domainNameServers(Output.of(domainNameServers));
        }

        /**
         * @param dryRun Specifies whether to precheck this request only. Valid values: `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun Specifies whether to precheck this request only. Valid values: `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param ownerId The ID of the account to which the DHCP options set belongs.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The ID of the account to which the DHCP options set belongs.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param status The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the DHCP options set. Valid values: `Available`, `InUse` or `Pending`. `Available`: The DHCP options set is available for use. `InUse`: The DHCP options set is in use. `Pending`: The DHCP options set is being configured.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public DhcpOptionsSetState build() {
            return $;
        }
    }

}