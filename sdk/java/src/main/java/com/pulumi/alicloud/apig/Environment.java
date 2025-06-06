// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apig;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.apig.EnvironmentArgs;
import com.pulumi.alicloud.apig.inputs.EnvironmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a APIG Environment resource.
 * 
 * For information about APIG Environment and how to use it, see [What is Environment](https://next.api.aliyun.com/api/APIG/2024-03-27/CreateEnvironment).
 * 
 * &gt; **NOTE:** Available since v1.240.0.
 * 
 * ## Import
 * 
 * APIG Environment can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:apig/environment:Environment example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:apig/environment:Environment")
public class Environment extends com.pulumi.resources.CustomResource {
    /**
     * Description
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="environmentName", refs={String.class}, tree="[0]")
    private Output<String> environmentName;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> environmentName() {
        return this.environmentName;
    }
    /**
     * Gateway id
     * 
     */
    @Export(name="gatewayId", refs={String.class}, tree="[0]")
    private Output<String> gatewayId;

    /**
     * @return Gateway id
     * 
     */
    public Output<String> gatewayId() {
        return this.gatewayId;
    }
    /**
     * The ID of the resource group
     * 
     */
    @Export(name="resourceGroupId", refs={String.class}, tree="[0]")
    private Output<String> resourceGroupId;

    /**
     * @return The ID of the resource group
     * 
     */
    public Output<String> resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(java.lang.String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(java.lang.String name, EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(java.lang.String name, EnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apig/environment:Environment", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Environment(java.lang.String name, Output<java.lang.String> id, @Nullable EnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:apig/environment:Environment", name, state, makeResourceOptions(options, id), false);
    }

    private static EnvironmentArgs makeArgs(EnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? EnvironmentArgs.Empty : args;
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
    public static Environment get(java.lang.String name, Output<java.lang.String> id, @Nullable EnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, state, options);
    }
}
