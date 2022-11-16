// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.SecurityGroupRuleArgs;
import com.pulumi.alicloud.ecs.inputs.SecurityGroupRuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="alicloud:ecs/securityGroupRule:SecurityGroupRule")
public class SecurityGroupRule extends com.pulumi.resources.CustomResource {
    /**
     * The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
     * 
     */
    @Export(name="cidrIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> cidrIp;

    /**
     * @return The target IP address range. The default value is 0.0.0.0/0 (which means no restriction will be applied). Other supported formats include 10.159.6.18/12. Only IPv4 is supported.
     * 
     */
    public Output<Optional<String>> cidrIp() {
        return Codegen.optional(this.cidrIp);
    }
    /**
     * The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the security group rule. The description can be up to 1 to 512 characters in length. Defaults to null.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     * 
     */
    @Export(name="ipProtocol", type=String.class, parameters={})
    private Output<String> ipProtocol;

    /**
     * @return The protocol. Can be `tcp`, `udp`, `icmp`, `gre` or `all`.
     * 
     */
    public Output<String> ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidr_ip` parameter.
     * 
     */
    @Export(name="ipv6CidrIp", type=String.class, parameters={})
    private Output</* @Nullable */ String> ipv6CidrIp;

    /**
     * @return Source IPv6 CIDR address block that requires access. Supports IP address ranges in CIDR format and IPv6 format. **NOTE:** This parameter cannot be set at the same time as the `cidr_ip` parameter.
     * 
     */
    public Output<Optional<String>> ipv6CidrIp() {
        return Codegen.optional(this.ipv6CidrIp);
    }
    /**
     * Network type, can be either `internet` or `intranet`, the default value is `internet`.
     * 
     */
    @Export(name="nicType", type=String.class, parameters={})
    private Output<String> nicType;

    /**
     * @return Network type, can be either `internet` or `intranet`, the default value is `internet`.
     * 
     */
    public Output<String> nicType() {
        return this.nicType;
    }
    /**
     * Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output</* @Nullable */ String> policy;

    /**
     * @return Authorization policy, can be either `accept` or `drop`, the default value is `accept`.
     * 
     */
    public Output<Optional<String>> policy() {
        return Codegen.optional(this.policy);
    }
    /**
     * The range of port numbers relevant to the IP protocol. Default to &#34;-1/-1&#34;. When the protocol is tcp or udp, each side port number range from 1 to 65535 and &#39;-1/-1&#39; will be invalid.
     * For example, `1/200` means that the range of the port numbers is 1-200. Other protocols&#39; &#39;port_range&#39; can only be &#34;-1/-1&#34;, and other values will be invalid.
     * 
     */
    @Export(name="portRange", type=String.class, parameters={})
    private Output</* @Nullable */ String> portRange;

    /**
     * @return The range of port numbers relevant to the IP protocol. Default to &#34;-1/-1&#34;. When the protocol is tcp or udp, each side port number range from 1 to 65535 and &#39;-1/-1&#39; will be invalid.
     * For example, `1/200` means that the range of the port numbers is 1-200. Other protocols&#39; &#39;port_range&#39; can only be &#34;-1/-1&#34;, and other values will be invalid.
     * 
     */
    public Output<Optional<String>> portRange() {
        return Codegen.optional(this.portRange);
    }
    /**
     * The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidr_ip`,`source_security_group_id`,`ipv6_cidr_ip` parameter, this parameter is ignored.
     * 
     */
    @Export(name="prefixListId", type=String.class, parameters={})
    private Output<String> prefixListId;

    /**
     * @return The ID of the source/destination prefix list to which you want to control access. **NOTE:** If you specify `cidr_ip`,`source_security_group_id`,`ipv6_cidr_ip` parameter, this parameter is ignored.
     * 
     */
    public Output<String> prefixListId() {
        return this.prefixListId;
    }
    /**
     * Authorization policy priority, with parameter values: `1-100`, default value: 1.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> priority;

    /**
     * @return Authorization policy priority, with parameter values: `1-100`, default value: 1.
     * 
     */
    public Output<Optional<Integer>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * The security group to apply this rule to.
     * 
     */
    @Export(name="securityGroupId", type=String.class, parameters={})
    private Output<String> securityGroupId;

    /**
     * @return The security group to apply this rule to.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
     * 
     */
    @Export(name="sourceGroupOwnerAccount", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceGroupOwnerAccount;

    /**
     * @return The Alibaba Cloud user account Id of the target security group when security groups are authorized across accounts.  This parameter is invalid if `cidr_ip` has already been set.
     * 
     */
    public Output<Optional<String>> sourceGroupOwnerAccount() {
        return Codegen.optional(this.sourceGroupOwnerAccount);
    }
    /**
     * The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
     * 
     */
    @Export(name="sourceSecurityGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceSecurityGroupId;

    /**
     * @return The target security group ID within the same region. If this field is specified, the `nic_type` can only select `intranet`.
     * 
     */
    public Output<Optional<String>> sourceSecurityGroupId() {
        return Codegen.optional(this.sourceSecurityGroupId);
    }
    /**
     * The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of rule being created. Valid options are `ingress` (inbound) or `egress` (outbound).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityGroupRule(String name) {
        this(name, SecurityGroupRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityGroupRule(String name, SecurityGroupRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityGroupRule(String name, SecurityGroupRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/securityGroupRule:SecurityGroupRule", name, args == null ? SecurityGroupRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityGroupRule(String name, Output<String> id, @Nullable SecurityGroupRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/securityGroupRule:SecurityGroupRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecurityGroupRule get(String name, Output<String> id, @Nullable SecurityGroupRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityGroupRule(name, id, state, options);
    }
}