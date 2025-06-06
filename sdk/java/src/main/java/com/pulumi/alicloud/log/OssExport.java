// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.log;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.log.OssExportArgs;
import com.pulumi.alicloud.log.inputs.OssExportState;
import com.pulumi.alicloud.log.outputs.OssExportConfigColumn;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Log service data delivery management, this service provides the function of delivering data in logstore to oss product storage. [Refer to details](https://www.alibabacloud.com/help/en/log-service/latest/ship-logs-to-oss-new-version).
 * 
 * &gt; **NOTE:** Available since v1.187.0.
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
 * import com.pulumi.alicloud.log.Project;
 * import com.pulumi.alicloud.log.ProjectArgs;
 * import com.pulumi.alicloud.log.Store;
 * import com.pulumi.alicloud.log.StoreArgs;
 * import com.pulumi.alicloud.log.OssExport;
 * import com.pulumi.alicloud.log.OssExportArgs;
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
 *         var default_ = new Integer("default", IntegerArgs.builder()
 *             .max(99999)
 *             .min(10000)
 *             .build());
 * 
 *         var example = new Project("example", ProjectArgs.builder()
 *             .projectName(String.format("terraform-example-%s", default_.result()))
 *             .description("terraform-example")
 *             .tags(Map.ofEntries(
 *                 Map.entry("Created", "TF"),
 *                 Map.entry("For", "example")
 *             ))
 *             .build());
 * 
 *         var exampleStore = new Store("exampleStore", StoreArgs.builder()
 *             .projectName(example.projectName())
 *             .logstoreName("example-store")
 *             .retentionPeriod(3650)
 *             .shardCount(3)
 *             .autoSplit(true)
 *             .maxSplitShardCount(60)
 *             .appendMeta(true)
 *             .build());
 * 
 *         var exampleOssExport = new OssExport("exampleOssExport", OssExportArgs.builder()
 *             .projectName(example.projectName())
 *             .logstoreName(exampleStore.logstoreName())
 *             .exportName("terraform-example")
 *             .displayName("terraform-example")
 *             .bucket("example-bucket")
 *             .prefix("root")
 *             .suffix("")
 *             .bufferInterval(300)
 *             .bufferSize(250)
 *             .compressType("none")
 *             .pathFormat("%Y/%m/%d/%H/%M")
 *             .contentType("json")
 *             .jsonEnableTag(true)
 *             .roleArn("role_arn_for_oss_write")
 *             .logReadRoleArn("role_arn_for_sls_read")
 *             .timeZone("+0800")
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
 * Log oss export can be imported using the id or name, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:log/ossExport:OssExport example tf-log-project:tf-log-logstore:tf-log-export
 * ```
 * 
 */
@ResourceType(type="alicloud:log/ossExport:OssExport")
public class OssExport extends com.pulumi.resources.CustomResource {
    /**
     * The name of the oss bucket.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return The name of the oss bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * How often is it delivered every interval.
     * 
     */
    @Export(name="bufferInterval", refs={Integer.class}, tree="[0]")
    private Output<Integer> bufferInterval;

    /**
     * @return How often is it delivered every interval.
     * 
     */
    public Output<Integer> bufferInterval() {
        return this.bufferInterval;
    }
    /**
     * Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
     * 
     */
    @Export(name="bufferSize", refs={Integer.class}, tree="[0]")
    private Output<Integer> bufferSize;

    /**
     * @return Automatically control the creation interval of delivery tasks and set the upper limit of an OSS object size (calculated in uncompressed), unit: `MB`.
     * 
     */
    public Output<Integer> bufferSize() {
        return this.bufferSize;
    }
    /**
     * OSS data storage compression method, support: `none`, `snappy`, `zstd`, `gzip`. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
     * 
     */
    @Export(name="compressType", refs={String.class}, tree="[0]")
    private Output<String> compressType;

    /**
     * @return OSS data storage compression method, support: `none`, `snappy`, `zstd`, `gzip`. Among them, none means that the original data is not compressed, and snappy means that the data is compressed using the snappy algorithm, which can reduce the storage space usage of the `OSS Bucket`.
     * 
     */
    public Output<String> compressType() {
        return this.compressType;
    }
    /**
     * Configure columns when `content_type` is `parquet` or `orc`.
     * 
     */
    @Export(name="configColumns", refs={List.class,OssExportConfigColumn.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OssExportConfigColumn>> configColumns;

    /**
     * @return Configure columns when `content_type` is `parquet` or `orc`.
     * 
     */
    public Output<Optional<List<OssExportConfigColumn>>> configColumns() {
        return Codegen.optional(this.configColumns);
    }
    /**
     * Storage format, only supports three types: `json`, `parquet`, `orc`, `csv`.
     * **According to the different format, please select the following parameters**
     * 
     */
    @Export(name="contentType", refs={String.class}, tree="[0]")
    private Output<String> contentType;

    /**
     * @return Storage format, only supports three types: `json`, `parquet`, `orc`, `csv`.
     * **According to the different format, please select the following parameters**
     * 
     */
    public Output<String> contentType() {
        return this.contentType;
    }
    /**
     * Field configuration in csv content_type.
     * 
     */
    @Export(name="csvConfigColumns", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> csvConfigColumns;

    /**
     * @return Field configuration in csv content_type.
     * 
     */
    public Output<Optional<List<String>>> csvConfigColumns() {
        return Codegen.optional(this.csvConfigColumns);
    }
    /**
     * Separator configuration in csv content_type.
     * 
     */
    @Export(name="csvConfigDelimiter", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> csvConfigDelimiter;

    /**
     * @return Separator configuration in csv content_type.
     * 
     */
    public Output<Optional<String>> csvConfigDelimiter() {
        return Codegen.optional(this.csvConfigDelimiter);
    }
    /**
     * escape in csv content_type.
     * 
     */
    @Export(name="csvConfigEscape", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> csvConfigEscape;

    /**
     * @return escape in csv content_type.
     * 
     */
    public Output<Optional<String>> csvConfigEscape() {
        return Codegen.optional(this.csvConfigEscape);
    }
    /**
     * Indicates whether to write the field name to the CSV file, the default value is `false`.
     * 
     */
    @Export(name="csvConfigHeader", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> csvConfigHeader;

    /**
     * @return Indicates whether to write the field name to the CSV file, the default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> csvConfigHeader() {
        return Codegen.optional(this.csvConfigHeader);
    }
    /**
     * lineFeed in csv content_type.
     * 
     */
    @Export(name="csvConfigLinefeed", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> csvConfigLinefeed;

    /**
     * @return lineFeed in csv content_type.
     * 
     */
    public Output<Optional<String>> csvConfigLinefeed() {
        return Codegen.optional(this.csvConfigLinefeed);
    }
    /**
     * Invalid field content in csv content_type.
     * 
     */
    @Export(name="csvConfigNull", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> csvConfigNull;

    /**
     * @return Invalid field content in csv content_type.
     * 
     */
    public Output<Optional<String>> csvConfigNull() {
        return Codegen.optional(this.csvConfigNull);
    }
    /**
     * Escape character in csv content_type.
     * 
     */
    @Export(name="csvConfigQuote", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> csvConfigQuote;

    /**
     * @return Escape character in csv content_type.
     * 
     */
    public Output<Optional<String>> csvConfigQuote() {
        return Codegen.optional(this.csvConfigQuote);
    }
    /**
     * The display name for oss export.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name for oss export.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
     * 
     */
    @Export(name="exportName", refs={String.class}, tree="[0]")
    private Output<String> exportName;

    /**
     * @return Delivery configuration name, it can only contain lowercase letters, numbers, dashes `-` and underscores `_`. It must start and end with lowercase letters or numbers, and the name must be 2 to 128 characters long.
     * 
     */
    public Output<String> exportName() {
        return this.exportName;
    }
    /**
     * The log from when to export to oss.
     * 
     */
    @Export(name="fromTime", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> fromTime;

    /**
     * @return The log from when to export to oss.
     * 
     */
    public Output<Optional<Integer>> fromTime() {
        return Codegen.optional(this.fromTime);
    }
    /**
     * Whether to deliver the label when `content_type` = `json`.
     * 
     */
    @Export(name="jsonEnableTag", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> jsonEnableTag;

    /**
     * @return Whether to deliver the label when `content_type` = `json`.
     * 
     */
    public Output<Optional<Boolean>> jsonEnableTag() {
        return Codegen.optional(this.jsonEnableTag);
    }
    /**
     * Used for logstore reading, the role should have log read policy, such as `acs:ram::13234:role/logrole`, if `log_read_role_arn` is not set, `role_arn` is used to read logstore.
     * 
     */
    @Export(name="logReadRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> logReadRoleArn;

    /**
     * @return Used for logstore reading, the role should have log read policy, such as `acs:ram::13234:role/logrole`, if `log_read_role_arn` is not set, `role_arn` is used to read logstore.
     * 
     */
    public Output<Optional<String>> logReadRoleArn() {
        return Codegen.optional(this.logReadRoleArn);
    }
    /**
     * The name of the log logstore.
     * 
     */
    @Export(name="logstoreName", refs={String.class}, tree="[0]")
    private Output<String> logstoreName;

    /**
     * @return The name of the log logstore.
     * 
     */
    public Output<String> logstoreName() {
        return this.logstoreName;
    }
    /**
     * The OSS Bucket directory is dynamically generated according to the creation time of the export task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
     * 
     */
    @Export(name="pathFormat", refs={String.class}, tree="[0]")
    private Output<String> pathFormat;

    /**
     * @return The OSS Bucket directory is dynamically generated according to the creation time of the export task, it cannot start with a forward slash `/`, the default value is `%Y/%m/%d/%H/%M`.
     * 
     */
    public Output<String> pathFormat() {
        return this.pathFormat;
    }
    /**
     * The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
     * 
     */
    @Export(name="prefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> prefix;

    /**
     * @return The data synchronized from Log Service to OSS will be stored in this directory of Bucket.
     * 
     */
    public Output<Optional<String>> prefix() {
        return Codegen.optional(this.prefix);
    }
    /**
     * The name of the log project. It is the only in one Alicloud account.
     * 
     */
    @Export(name="projectName", refs={String.class}, tree="[0]")
    private Output<String> projectName;

    /**
     * @return The name of the log project. It is the only in one Alicloud account.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }
    /**
     * Used to write to oss bucket, the OSS Bucket owner creates the role mark which has the oss bucket write policy, such as `acs:ram::13234:role/logrole`.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> roleArn;

    /**
     * @return Used to write to oss bucket, the OSS Bucket owner creates the role mark which has the oss bucket write policy, such as `acs:ram::13234:role/logrole`.
     * 
     */
    public Output<Optional<String>> roleArn() {
        return Codegen.optional(this.roleArn);
    }
    /**
     * The suffix for the objects in which the shipped data is stored.
     * 
     */
    @Export(name="suffix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> suffix;

    /**
     * @return The suffix for the objects in which the shipped data is stored.
     * 
     */
    public Output<Optional<String>> suffix() {
        return Codegen.optional(this.suffix);
    }
    /**
     * This time zone that is used to format the time, `+0800` e.g.
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output<String> timeZone;

    /**
     * @return This time zone that is used to format the time, `+0800` e.g.
     * 
     */
    public Output<String> timeZone() {
        return this.timeZone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OssExport(java.lang.String name) {
        this(name, OssExportArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OssExport(java.lang.String name, OssExportArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OssExport(java.lang.String name, OssExportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/ossExport:OssExport", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private OssExport(java.lang.String name, Output<java.lang.String> id, @Nullable OssExportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:log/ossExport:OssExport", name, state, makeResourceOptions(options, id), false);
    }

    private static OssExportArgs makeArgs(OssExportArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? OssExportArgs.Empty : args;
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
    public static OssExport get(java.lang.String name, Output<java.lang.String> id, @Nullable OssExportState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OssExport(name, id, state, options);
    }
}
