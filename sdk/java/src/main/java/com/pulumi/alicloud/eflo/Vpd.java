// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eflo;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.eflo.VpdArgs;
import com.pulumi.alicloud.eflo.inputs.VpdState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Eflo Vpd resource.
 * 
 * For information about Eflo Vpd and how to use it, see [What is Vpd](https://help.aliyun.com/document_detail/604976.html).
 * 
 * &gt; **NOTE:** Available in v1.201.0+.
 * 
 * ## Example Usage
 * 
 * Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.alicloud.eflo.Vpd;
 * import com.pulumi.alicloud.eflo.VpdArgs;
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
 *         var default_ = new Vpd(&#34;default&#34;, VpdArgs.builder()        
 *             .cidr(&#34;10.0.0.0/8&#34;)
 *             .vpdName(&#34;RMC-Terraform-Test&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Eflo Vpd can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:eflo/vpd:Vpd example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:eflo/vpd:Vpd")
public class Vpd extends com.pulumi.resources.CustomResource {
    /**
     * CIDR network segment
     * 
     */
    @Export(name="cidr", type=String.class, parameters={})
    private Output<String> cidr;

    /**
     * @return CIDR network segment
     * 
     */
    public Output<String> cidr() {
        return this.cidr;
    }
    /**
     * The creation time of the resource
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The creation time of the resource
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Modification time
     * 
     */
    @Export(name="gmtModified", type=String.class, parameters={})
    private Output<String> gmtModified;

    /**
     * @return Modification time
     * 
     */
    public Output<String> gmtModified() {
        return this.gmtModified;
    }
    /**
     * The Resource group id
     * 
     */
    @Export(name="resourceGroupId", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceGroupId;

    /**
     * @return The Resource group id
     * 
     */
    public Output<Optional<String>> resourceGroupId() {
        return Codegen.optional(this.resourceGroupId);
    }
    /**
     * The Vpd status.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The Vpd status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The Name of the VPD.
     * 
     */
    @Export(name="vpdName", type=String.class, parameters={})
    private Output<String> vpdName;

    /**
     * @return The Name of the VPD.
     * 
     */
    public Output<String> vpdName() {
        return this.vpdName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Vpd(String name) {
        this(name, VpdArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Vpd(String name, VpdArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Vpd(String name, VpdArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eflo/vpd:Vpd", name, args == null ? VpdArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Vpd(String name, Output<String> id, @Nullable VpdState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:eflo/vpd:Vpd", name, state, makeResourceOptions(options, id));
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
    public static Vpd get(String name, Output<String> id, @Nullable VpdState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Vpd(name, id, state, options);
    }
}