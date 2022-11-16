// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.resourcemanager;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.resourcemanager.SharedResourceArgs;
import com.pulumi.alicloud.resourcemanager.inputs.SharedResourceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Resource Manager Shared Resource resource.
 * 
 * For information about Resource Manager Shared Resource and how to use it, see [What is Shared Resource](https://www.alibabacloud.com/help/en/doc-detail/94475.htm).
 * 
 * &gt; **NOTE:** Available in v1.111.0+.
 * 
 * ## Import
 * 
 * Resource Manager Shared Resource can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:resourcemanager/sharedResource:SharedResource example &lt;resource_share_id&gt;:&lt;resource_id&gt;:&lt;resource_type&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:resourcemanager/sharedResource:SharedResource")
public class SharedResource extends com.pulumi.resources.CustomResource {
    /**
     * The resource ID need shared.
     * 
     */
    @Export(name="resourceId", type=String.class, parameters={})
    private Output<String> resourceId;

    /**
     * @return The resource ID need shared.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }
    /**
     * The resource share ID of resource manager.
     * 
     */
    @Export(name="resourceShareId", type=String.class, parameters={})
    private Output<String> resourceShareId;

    /**
     * @return The resource share ID of resource manager.
     * 
     */
    public Output<String> resourceShareId() {
        return this.resourceShareId;
    }
    /**
     * The resource type of should shared, valid value `VSwitch`. The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
     * 
     */
    @Export(name="resourceType", type=String.class, parameters={})
    private Output<String> resourceType;

    /**
     * @return The resource type of should shared, valid value `VSwitch`. The following types are added after v1.173.0: `ROSTemplate` and `ServiceCatalogPortfolio`.
     * 
     */
    public Output<String> resourceType() {
        return this.resourceType;
    }
    /**
     * status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedResource(String name) {
        this(name, SharedResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedResource(String name, SharedResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedResource(String name, SharedResourceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/sharedResource:SharedResource", name, args == null ? SharedResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SharedResource(String name, Output<String> id, @Nullable SharedResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:resourcemanager/sharedResource:SharedResource", name, state, makeResourceOptions(options, id));
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
    public static SharedResource get(String name, Output<String> id, @Nullable SharedResourceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedResource(name, id, state, options);
    }
}