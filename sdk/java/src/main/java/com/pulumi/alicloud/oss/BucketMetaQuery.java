// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.oss;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.oss.BucketMetaQueryArgs;
import com.pulumi.alicloud.oss.inputs.BucketMetaQueryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a OSS Bucket Meta Query resource. Enables the metadata management feature for a bucket.
 * 
 * For information about OSS Bucket Meta Query and how to use it, see [What is Bucket Meta Query](https://www.alibabacloud.com/help/en/oss/developer-reference/openmetaquery).
 * 
 * &gt; **NOTE:** Available since v1.224.0.
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
 * import com.pulumi.random.integer;
 * import com.pulumi.random.integerArgs;
 * import com.pulumi.alicloud.oss.Bucket;
 * import com.pulumi.alicloud.oss.BucketArgs;
 * import com.pulumi.alicloud.oss.BucketMetaQuery;
 * import com.pulumi.alicloud.oss.BucketMetaQueryArgs;
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
 *         final var config = ctx.config();
 *         final var name = config.get("name").orElse("terraform-example");
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .min(10000)
 *             .max(99999)
 *             .build());
 * 
 *         var createBucket = new Bucket("createBucket", BucketArgs.builder()
 *             .storageClass("Standard")
 *             .bucket(String.format("%s-%s", name,default_.result()))
 *             .build());
 * 
 *         var defaultBucketMetaQuery = new BucketMetaQuery("defaultBucketMetaQuery", BucketMetaQueryArgs.builder()
 *             .bucket(createBucket.bucket())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * OSS Bucket Meta Query can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:oss/bucketMetaQuery:BucketMetaQuery example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:oss/bucketMetaQuery:BucketMetaQuery")
public class BucketMetaQuery extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The creation time of the metadata index database. The format is mm:ss + TIMEZONE in the YYYY-MM-DDTHH format of RFC 3339. Where YYYY-MM-DD indicates the year, month and day, T indicates the beginning of the time element, HH:mm:ss indicates the hour, minute and second, and TIMEZONE indicates the time zone.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The creation time of the metadata index database. The format is mm:ss + TIMEZONE in the YYYY-MM-DDTHH format of RFC 3339. Where YYYY-MM-DD indicates the year, month and day, T indicates the beginning of the time element, HH:mm:ss indicates the hour, minute and second, and TIMEZONE indicates the time zone.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The status of the resource.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The status of the resource.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketMetaQuery(java.lang.String name) {
        this(name, BucketMetaQueryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketMetaQuery(java.lang.String name, BucketMetaQueryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketMetaQuery(java.lang.String name, BucketMetaQueryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucketMetaQuery:BucketMetaQuery", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private BucketMetaQuery(java.lang.String name, Output<java.lang.String> id, @Nullable BucketMetaQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:oss/bucketMetaQuery:BucketMetaQuery", name, state, makeResourceOptions(options, id), false);
    }

    private static BucketMetaQueryArgs makeArgs(BucketMetaQueryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? BucketMetaQueryArgs.Empty : args;
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
    public static BucketMetaQuery get(java.lang.String name, Output<java.lang.String> id, @Nullable BucketMetaQueryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketMetaQuery(name, id, state, options);
    }
}
