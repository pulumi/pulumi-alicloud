// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gwlb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gwlb.ListenerArgs;
import com.pulumi.alicloud.gwlb.inputs.ListenerState;
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
 * Provides a GWLB Listener resource.
 * 
 * For information about GWLB Listener and how to use it, see [What is Listener](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.234.0.
 * 
 * ## Import
 * 
 * GWLB Listener can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:gwlb/listener:Listener example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:gwlb/listener:Listener")
public class Listener extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether to perform only a dry run, without performing the actual request.
     * 
     */
    @Export(name="dryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dryRun;

    /**
     * @return Specifies whether to perform only a dry run, without performing the actual request.
     * 
     */
    public Output<Optional<Boolean>> dryRun() {
        return Codegen.optional(this.dryRun);
    }
    /**
     * The custom listener description.
     * 
     * The length is limited to 2 to 256 characters. It supports Chinese and English letters and can contain numbers, half-width commas (,), half-width periods (.), half-width semicolons (;), forward slashes (/), at({@literal @}), underscores (_), and dashes (-).
     * 
     */
    @Export(name="listenerDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> listenerDescription;

    /**
     * @return The custom listener description.
     * 
     * The length is limited to 2 to 256 characters. It supports Chinese and English letters and can contain numbers, half-width commas (,), half-width periods (.), half-width semicolons (;), forward slashes (/), at({@literal @}), underscores (_), and dashes (-).
     * 
     */
    public Output<Optional<String>> listenerDescription() {
        return Codegen.optional(this.listenerDescription);
    }
    /**
     * The ID of the gateway load balancer instance.
     * 
     */
    @Export(name="loadBalancerId", refs={String.class}, tree="[0]")
    private Output<String> loadBalancerId;

    /**
     * @return The ID of the gateway load balancer instance.
     * 
     */
    public Output<String> loadBalancerId() {
        return this.loadBalancerId;
    }
    /**
     * The ID of the region.
     * 
     */
    @Export(name="regionId", refs={String.class}, tree="[0]")
    private Output<String> regionId;

    /**
     * @return The ID of the region.
     * 
     */
    public Output<String> regionId() {
        return this.regionId;
    }
    /**
     * The ID of the server group.
     * 
     */
    @Export(name="serverGroupId", refs={String.class}, tree="[0]")
    private Output<String> serverGroupId;

    /**
     * @return The ID of the server group.
     * 
     */
    public Output<String> serverGroupId() {
        return this.serverGroupId;
    }
    /**
     * The current status of the listener. Value:
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of the listener. Value:
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The list of tags.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The list of tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Listener(java.lang.String name) {
        this(name, ListenerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Listener(java.lang.String name, ListenerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Listener(java.lang.String name, ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gwlb/listener:Listener", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Listener(java.lang.String name, Output<java.lang.String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:gwlb/listener:Listener", name, state, makeResourceOptions(options, id), false);
    }

    private static ListenerArgs makeArgs(ListenerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ListenerArgs.Empty : args;
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
    public static Listener get(java.lang.String name, Output<java.lang.String> id, @Nullable ListenerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Listener(name, id, state, options);
    }
}