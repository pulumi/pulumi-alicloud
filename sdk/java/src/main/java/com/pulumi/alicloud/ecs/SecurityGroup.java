// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ecs.SecurityGroupArgs;
import com.pulumi.alicloud.ecs.inputs.SecurityGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a ECS Security Group resource.
 * 
 * For information about ECS Security Group and how to use it, see [What is Security Group](https://www.alibabacloud.com/help/en/ecs/developer-reference/api-createsecuritygroup).
 * 
 * &gt; **NOTE:** Available since v1.0.0.
 * 
 * &gt; **NOTE:** `alicloud.ecs.SecurityGroup` is used to build and manage a security group, and `alicloud.ecs.SecurityGroupRule` can define ingress or egress rules for it.
 * 
 * &gt; **NOTE:** From version 1.7.2, `alicloud.ecs.SecurityGroup` has supported to segregate different ECS instance in which the same security group.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new SecurityGroup("default", SecurityGroupArgs.builder()
 *             .securityGroupName("terraform-example")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * Basic Usage for VPC
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.vpc.Network;
 * import com.pulumi.alicloud.vpc.NetworkArgs;
 * import com.pulumi.alicloud.ecs.SecurityGroup;
 * import com.pulumi.alicloud.ecs.SecurityGroupArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var default_ = new Network("default", NetworkArgs.builder()
 *             .vpcName("terraform-example")
 *             .cidrBlock("172.16.0.0/16")
 *             .build());
 * 
 *         var defaultSecurityGroup = new SecurityGroup("defaultSecurityGroup", SecurityGroupArgs.builder()
 *             .securityGroupName("terraform-example")
 *             .vpcId(default_.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Module Support
 * 
 * You can use the existing security-group module
 * to create a security group and add several rules one-click.
 * 
 * ## Import
 * 
 * ECS Security Group can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ecs/securityGroup:SecurityGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:ecs/securityGroup:SecurityGroup")
public class SecurityGroup extends com.pulumi.resources.CustomResource {
    /**
     * (Available since v1.239.0) The time when the security group was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return (Available since v1.239.0) The time when the security group was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The description of the security group. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the security group. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Field `inner_access` has been deprecated from provider version 1.55.3. New field `inner_access_policy` instead.
     * 
     * @deprecated
     * Field `inner_access` has been deprecated from provider version 1.55.3. New field `inner_access_policy` instead.
     * 
     */
    @Deprecated /* Field `inner_access` has been deprecated from provider version 1.55.3. New field `inner_access_policy` instead. */
    @Export(name="innerAccess", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> innerAccess;

    /**
     * @return Field `inner_access` has been deprecated from provider version 1.55.3. New field `inner_access_policy` instead.
     * 
     */
    public Output<Boolean> innerAccess() {
        return this.innerAccess;
    }
    /**
     * The internal access control policy of the security group. Valid values:
     * - `Accept`: The internal interconnectivity policy.
     * - `Drop`: The internal isolation policy.
     * 
     */
    @Export(name="innerAccessPolicy", refs={String.class}, tree="[0]")
    private Output<String> innerAccessPolicy;

    /**
     * @return The internal access control policy of the security group. Valid values:
     * - `Accept`: The internal interconnectivity policy.
     * - `Drop`: The internal isolation policy.
     * 
     */
    public Output<String> innerAccessPolicy() {
        return this.innerAccessPolicy;
    }
    /**
     * Field `name` has been deprecated from provider version 1.239.0. New field `security_group_name` instead.
     * 
     * @deprecated
     * Field `name` has been deprecated from provider version 1.239.0. New field `security_group_name` instead.
     * 
     */
    @Deprecated /* Field `name` has been deprecated from provider version 1.239.0. New field `security_group_name` instead. */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Field `name` has been deprecated from provider version 1.239.0. New field `security_group_name` instead.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the resource group to which the security group belongs. **NOTE:** From version 1.115.0, `resource_group_id` can be modified.
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The ID of the resource group to which the security group belongs. **NOTE:** From version 1.115.0, `resource_group_id` can be modified.
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The name of the security group. The name must be `2` to `128` characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (\_), periods (.), and hyphens (-).
     * 
     */
    @Export(name="securityGroupName", refs={String.class}, tree="[0]")
    private Output<String> securityGroupName;

    /**
     * @return The name of the security group. The name must be `2` to `128` characters in length. The name must start with a letter and cannot start with `http://` or `https://`. The name can contain Unicode characters under the Decimal Number category and the categories whose names contain Letter. The name can also contain colons (:), underscores (\_), periods (.), and hyphens (-).
     * 
     */
    public Output<String> securityGroupName() {
        return this.securityGroupName;
    }
    /**
     * The type of the security group. Default value: `normal`. Valid values:
     * 
     */
    @Export(name="securityGroupType", refs={String.class}, tree="[0]")
    private Output<String> securityGroupType;

    /**
     * @return The type of the security group. Default value: `normal`. Valid values:
     * 
     */
    public Output<String> securityGroupType() {
        return this.securityGroupType;
    }
    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the VPC in which you want to create the security group.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC in which you want to create the security group.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityGroup(java.lang.String name) {
        this(name, SecurityGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityGroup(java.lang.String name, @Nullable SecurityGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityGroup(java.lang.String name, @Nullable SecurityGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/securityGroup:SecurityGroup", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private SecurityGroup(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ecs/securityGroup:SecurityGroup", name, state, makeResourceOptions(options, id), false);
    }

    private static SecurityGroupArgs makeArgs(@Nullable SecurityGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? SecurityGroupArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static SecurityGroup get(java.lang.String name, Output<java.lang.String> id, @Nullable SecurityGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityGroup(name, id, state, options);
    }
}
