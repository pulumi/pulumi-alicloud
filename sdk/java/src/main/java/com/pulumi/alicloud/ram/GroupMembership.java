// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ram;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ram.GroupMembershipArgs;
import com.pulumi.alicloud.ram.inputs.GroupMembershipState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a RAM Group membership resource.
 * 
 * &gt; **NOTE:** Available since v1.0.0+.
 * 
 * ## Import
 * 
 * RAM Group membership can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:ram/groupMembership:GroupMembership example my-group
 * ```
 * 
 */
@ResourceType(type="alicloud:ram/groupMembership:GroupMembership")
public class GroupMembership extends com.pulumi.resources.CustomResource {
    /**
     * Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="groupName", refs={String.class}, tree="[0]")
    private Output<String> groupName;

    /**
     * @return Name of the RAM group. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphen &#34;-&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    @Export(name="userNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> userNames;

    /**
     * @return Set of user name which will be added to group. Each name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as &#34;-&#34;,&#34;.&#34;,&#34;_&#34;, and must not begin with a hyphen.
     * 
     */
    public Output<List<String>> userNames() {
        return this.userNames;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupMembership(java.lang.String name) {
        this(name, GroupMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupMembership(java.lang.String name, GroupMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupMembership(java.lang.String name, GroupMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/groupMembership:GroupMembership", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private GroupMembership(java.lang.String name, Output<java.lang.String> id, @Nullable GroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:ram/groupMembership:GroupMembership", name, state, makeResourceOptions(options, id), false);
    }

    private static GroupMembershipArgs makeArgs(GroupMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? GroupMembershipArgs.Empty : args;
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
    public static GroupMembership get(java.lang.String name, Output<java.lang.String> id, @Nullable GroupMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupMembership(name, id, state, options);
    }
}
