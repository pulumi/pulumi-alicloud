// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.threatdetection;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.threatdetection.FileUploadLimitArgs;
import com.pulumi.alicloud.threatdetection.inputs.FileUploadLimitState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Threat Detection File Upload Limit can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:threatdetection/fileUploadLimit:FileUploadLimit example
 * ```
 * 
 */
@ResourceType(type="alicloud:threatdetection/fileUploadLimit:FileUploadLimit")
public class FileUploadLimit extends com.pulumi.resources.CustomResource {
    /**
     * File Upload Threshold.
     * 
     */
    @Export(name="limit", refs={Integer.class}, tree="[0]")
    private Output<Integer> limit;

    /**
     * @return File Upload Threshold.
     * 
     */
    public Output<Integer> limit() {
        return this.limit;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FileUploadLimit(String name) {
        this(name, FileUploadLimitArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FileUploadLimit(String name, FileUploadLimitArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FileUploadLimit(String name, FileUploadLimitArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/fileUploadLimit:FileUploadLimit", name, args == null ? FileUploadLimitArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FileUploadLimit(String name, Output<String> id, @Nullable FileUploadLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:threatdetection/fileUploadLimit:FileUploadLimit", name, state, makeResourceOptions(options, id));
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
    public static FileUploadLimit get(String name, Output<String> id, @Nullable FileUploadLimitState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FileUploadLimit(name, id, state, options);
    }
}