// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pai;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.pai.WorkspaceDatasetversionArgs;
import com.pulumi.alicloud.pai.inputs.WorkspaceDatasetversionState;
import com.pulumi.alicloud.pai.outputs.WorkspaceDatasetversionLabel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a PAI Workspace Datasetversion resource.
 * 
 * For information about PAI Workspace Datasetversion and how to use it, see [What is Datasetversion](https://www.alibabacloud.com/help/en/).
 * 
 * &gt; **NOTE:** Available since v1.236.0.
 * 
 * ## Import
 * 
 * PAI Workspace Datasetversion can be imported using the id, e.g.
 * 
 * ```sh
 * $ pulumi import alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion example &lt;dataset_id&gt;:&lt;version_name&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion")
public class WorkspaceDatasetversion extends com.pulumi.resources.CustomResource {
    /**
     * Update time.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Update time.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Data count.
     * 
     */
    @Export(name="dataCount", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dataCount;

    /**
     * @return Data count.
     * 
     */
    public Output<Optional<Integer>> dataCount() {
        return Codegen.optional(this.dataCount);
    }
    /**
     * Data size.
     * 
     */
    @Export(name="dataSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> dataSize;

    /**
     * @return Data size.
     * 
     */
    public Output<Optional<Integer>> dataSize() {
        return Codegen.optional(this.dataSize);
    }
    /**
     * The data source type. The following values are supported:
     * - OSS: Alibaba Cloud Object Storage (OSS).
     * - NAS: Alibaba cloud file storage (NAS).
     * 
     */
    @Export(name="dataSourceType", refs={String.class}, tree="[0]")
    private Output<String> dataSourceType;

    /**
     * @return The data source type. The following values are supported:
     * - OSS: Alibaba Cloud Object Storage (OSS).
     * - NAS: Alibaba cloud file storage (NAS).
     * 
     */
    public Output<String> dataSourceType() {
        return this.dataSourceType;
    }
    /**
     * The first ID of the resource
     * 
     */
    @Export(name="datasetId", refs={String.class}, tree="[0]")
    private Output<String> datasetId;

    /**
     * @return The first ID of the resource
     * 
     */
    public Output<String> datasetId() {
        return this.datasetId;
    }
    /**
     * Description of dataset version.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of dataset version.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The tag of the resource See `labels` below.
     * 
     */
    @Export(name="labels", refs={List.class,WorkspaceDatasetversionLabel.class}, tree="[0,1]")
    private Output</* @Nullable */ List<WorkspaceDatasetversionLabel>> labels;

    /**
     * @return The tag of the resource See `labels` below.
     * 
     */
    public Output<Optional<List<WorkspaceDatasetversionLabel>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The extended field, which is of the JsonString type.
     * 
     * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
     * 
     */
    @Export(name="options", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> options;

    /**
     * @return The extended field, which is of the JsonString type.
     * 
     * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
     * 
     */
    public Output<Optional<String>> options() {
        return Codegen.optional(this.options);
    }
    /**
     * The properties of the dataset. The following values are supported:
     * - FILE: FILE.
     * - DIRECTORY: folder.
     * 
     */
    @Export(name="property", refs={String.class}, tree="[0]")
    private Output<String> property;

    /**
     * @return The properties of the dataset. The following values are supported:
     * - FILE: FILE.
     * - DIRECTORY: folder.
     * 
     */
    public Output<String> property() {
        return this.property;
    }
    /**
     * The data source ID.
     * 
     */
    @Export(name="sourceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceId;

    /**
     * @return The data source ID.
     * 
     */
    public Output<Optional<String>> sourceId() {
        return Codegen.optional(this.sourceId);
    }
    /**
     * The data source type. The default value is USER.
     * 
     */
    @Export(name="sourceType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> sourceType;

    /**
     * @return The data source type. The default value is USER.
     * 
     */
    public Output<Optional<String>> sourceType() {
        return Codegen.optional(this.sourceType);
    }
    /**
     * The Uri configuration sample is as follows:
     * - The data source type is OSS:&#39;oss:// bucket.endpoint/object&#39;
     * - The data source type is NAS:
     * 
     * The general NAS format is: &#39;nas://.region/subpath/to/dir/&#39;;
     * 
     * CPFS1.0:&#39;nas://.region/subpath/to/dir /&#39;;
     * 
     * CPFS2.0:&#39;nas://.region//&#39;.
     * 
     * CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
     * 
     */
    @Export(name="uri", refs={String.class}, tree="[0]")
    private Output<String> uri;

    /**
     * @return The Uri configuration sample is as follows:
     * - The data source type is OSS:&#39;oss:// bucket.endpoint/object&#39;
     * - The data source type is NAS:
     * 
     * The general NAS format is: &#39;nas://.region/subpath/to/dir/&#39;;
     * 
     * CPFS1.0:&#39;nas://.region/subpath/to/dir /&#39;;
     * 
     * CPFS2.0:&#39;nas://.region//&#39;.
     * 
     * CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
     * 
     */
    public Output<String> uri() {
        return this.uri;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="versionName", refs={String.class}, tree="[0]")
    private Output<String> versionName;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> versionName() {
        return this.versionName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkspaceDatasetversion(java.lang.String name) {
        this(name, WorkspaceDatasetversionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkspaceDatasetversion(java.lang.String name, WorkspaceDatasetversionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkspaceDatasetversion(java.lang.String name, WorkspaceDatasetversionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private WorkspaceDatasetversion(java.lang.String name, Output<java.lang.String> id, @Nullable WorkspaceDatasetversionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:pai/workspaceDatasetversion:WorkspaceDatasetversion", name, state, makeResourceOptions(options, id), false);
    }

    private static WorkspaceDatasetversionArgs makeArgs(WorkspaceDatasetversionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? WorkspaceDatasetversionArgs.Empty : args;
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
    public static WorkspaceDatasetversion get(java.lang.String name, Output<java.lang.String> id, @Nullable WorkspaceDatasetversionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkspaceDatasetversion(name, id, state, options);
    }
}