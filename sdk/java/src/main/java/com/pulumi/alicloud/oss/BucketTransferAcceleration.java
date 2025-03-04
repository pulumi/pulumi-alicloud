// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.oss.BucketTransferAccelerationArgs;
import com.pulumi.alicloud.oss.inputs.BucketTransferAccelerationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * OSS Bucket Transfer Acceleration can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:oss/bucketTransferAcceleration:BucketTransferAcceleration example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:oss/bucketTransferAcceleration:BucketTransferAcceleration")
public class BucketTransferAcceleration extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Bucket.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return The name of the Bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Specifies whether to enable transfer acceleration for the bucket. Valid values: true: transfer acceleration for the bucket is enabled. false: transfer acceleration for the bucket is disabled.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Specifies whether to enable transfer acceleration for the bucket. Valid values: true: transfer acceleration for the bucket is enabled. false: transfer acceleration for the bucket is disabled.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketTransferAcceleration(java.lang.String name) {
        this(name, BucketTransferAccelerationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketTransferAcceleration(java.lang.String name, BucketTransferAccelerationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketTransferAcceleration(java.lang.String name, BucketTransferAccelerationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucketTransferAcceleration:BucketTransferAcceleration", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BucketTransferAcceleration(java.lang.String name, Output<java.lang.String> id, @Nullable BucketTransferAccelerationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucketTransferAcceleration:BucketTransferAcceleration", name, state, makeResourceOptions(options, id), false);
    }

    private static BucketTransferAccelerationArgs makeArgs(BucketTransferAccelerationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BucketTransferAccelerationArgs.Empty : args;
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
    public static BucketTransferAcceleration get(java.lang.String name, Output<java.lang.String> id, @Nullable BucketTransferAccelerationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketTransferAcceleration(name, id, state, options);
    }
}
