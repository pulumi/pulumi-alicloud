// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.vpc.SnatEntryArgs;
import com.pulumi.alicloud.vpc.inputs.SnatEntryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a snat resource.
 * 
 * ## Import
 * 
 * Snat Entry can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:vpc/snatEntry:SnatEntry foo stb-1aece3:snat-232ce2
 * ```
 * 
 */
@ResourceType(type="alicloud:vpc/snatEntry:SnatEntry")
public class SnatEntry extends com.pulumi.resources.CustomResource {
    /**
     * The id of the snat entry on the server.
     * 
     */
    @Export(name="snatEntryId", type=String.class, parameters={})
    private Output<String> snatEntryId;

    /**
     * @return The id of the snat entry on the server.
     * 
     */
    public Output<String> snatEntryId() {
        return this.snatEntryId;
    }
    /**
     * The name of snat entry.
     * 
     */
    @Export(name="snatEntryName", type=String.class, parameters={})
    private Output</* @Nullable */ String> snatEntryName;

    /**
     * @return The name of snat entry.
     * 
     */
    public Output<Optional<String>> snatEntryName() {
        return Codegen.optional(this.snatEntryName);
    }
    /**
     * The SNAT ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
     * 
     */
    @Export(name="snatIp", type=String.class, parameters={})
    private Output<String> snatIp;

    /**
     * @return The SNAT ip address, the ip must along bandwidth package public ip which `alicloud.vpc.NatGateway` argument `bandwidth_packages`.
     * 
     */
    public Output<String> snatIp() {
        return this.snatIp;
    }
    /**
     * The value can get from `alicloud.vpc.NatGateway` Attributes &#34;snat_table_ids&#34;.
     * 
     */
    @Export(name="snatTableId", type=String.class, parameters={})
    private Output<String> snatTableId;

    /**
     * @return The value can get from `alicloud.vpc.NatGateway` Attributes &#34;snat_table_ids&#34;.
     * 
     */
    public Output<String> snatTableId() {
        return this.snatTableId;
    }
    /**
     * The private network segment of Ecs. This parameter and the `source_vswitch_id` parameter are mutually exclusive and cannot appear at the same time.
     * 
     */
    @Export(name="sourceCidr", type=String.class, parameters={})
    private Output<String> sourceCidr;

    /**
     * @return The private network segment of Ecs. This parameter and the `source_vswitch_id` parameter are mutually exclusive and cannot appear at the same time.
     * 
     */
    public Output<String> sourceCidr() {
        return this.sourceCidr;
    }
    /**
     * The vswitch ID.
     * 
     */
    @Export(name="sourceVswitchId", type=String.class, parameters={})
    private Output<String> sourceVswitchId;

    /**
     * @return The vswitch ID.
     * 
     */
    public Output<String> sourceVswitchId() {
        return this.sourceVswitchId;
    }
    /**
     * (Available in 1.119.1+) The status of snat entry.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return (Available in 1.119.1+) The status of snat entry.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SnatEntry(String name) {
        this(name, SnatEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SnatEntry(String name, SnatEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SnatEntry(String name, SnatEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/snatEntry:SnatEntry", name, args == null ? SnatEntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SnatEntry(String name, Output<String> id, @Nullable SnatEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:vpc/snatEntry:SnatEntry", name, state, makeResourceOptions(options, id));
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
    public static SnatEntry get(String name, Output<String> id, @Nullable SnatEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SnatEntry(name, id, state, options);
    }
}