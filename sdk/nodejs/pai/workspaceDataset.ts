// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a PAI Workspace Dataset resource.
 *
 * For information about PAI Workspace Dataset and how to use it, see [What is Dataset](https://next.api.alibabacloud.com/document/AIWorkSpace/2021-02-04/CreateDataset).
 *
 * > **NOTE:** Available since v1.236.0.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const config = new pulumi.Config();
 * const name = config.get("name") || "terraform_example";
 * const defaultWorkspace = new alicloud.pai.WorkspaceWorkspace("defaultWorkspace", {
 *     description: name,
 *     displayName: name,
 *     workspaceName: name,
 *     envTypes: ["prod"],
 * });
 * const _default = new alicloud.pai.WorkspaceDataset("default", {
 *     options: JSON.stringify({
 *         mountPath: "/mnt/data/",
 *     }),
 *     description: name,
 *     accessibility: "PRIVATE",
 *     datasetName: name,
 *     dataSourceType: "NAS",
 *     sourceType: "ITAG",
 *     workspaceId: defaultWorkspace.id,
 *     dataType: "PIC",
 *     property: "DIRECTORY",
 *     uri: "nas://086b649545.cn-hangzhou/",
 *     sourceId: "d-xxxxx_v1",
 *     userId: "1511928242963727",
 * });
 * ```
 *
 * ## Import
 *
 * PAI Workspace Dataset can be imported using the id, e.g.
 *
 * ```sh
 * $ pulumi import alicloud:pai/workspaceDataset:WorkspaceDataset example <id>
 * ```
 */
export class WorkspaceDataset extends pulumi.CustomResource {
    /**
     * Get an existing WorkspaceDataset resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkspaceDatasetState, opts?: pulumi.CustomResourceOptions): WorkspaceDataset {
        return new WorkspaceDataset(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:pai/workspaceDataset:WorkspaceDataset';

    /**
     * Returns true if the given object is an instance of WorkspaceDataset.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkspaceDataset {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkspaceDataset.__pulumiType;
    }

    /**
     * Workspace visibility. The following values are supported:
     * - PRIVATE (default): indicates that the workspace is visible to itself and the administrator.
     * - PUBLIC: The workspace is visible to all users.
     */
    public readonly accessibility!: pulumi.Output<string>;
    /**
     * The creation time of the resource
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * The data source type. The following values are supported:
     * - OSS: Alibaba Cloud Object Storage (OSS).
     * - NAS: Alibaba cloud file storage (NAS).
     */
    public readonly dataSourceType!: pulumi.Output<string>;
    /**
     * The dataset type. The default value is COMMON. The following values are supported:
     * - COMMON: COMMON.
     * - PIC: picture.
     * - TEXT: TEXT.
     * - VIDEO: VIDEO.
     * - AUDIO: AUDIO.
     */
    public readonly dataType!: pulumi.Output<string>;
    /**
     * The name of the dataset. The naming rules are as follows:
     * - Start with a lowercase letter, uppercase letter, number, or Chinese.
     * - Can contain an underscore (_) or a dash (-).
     * - 1~127 characters in length.
     */
    public readonly datasetName!: pulumi.Output<string>;
    /**
     * Custom descriptions of datasets to distinguish between different datasets.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Labels added to the dataset See `labels` below.
     */
    public readonly labels!: pulumi.Output<outputs.pai.WorkspaceDatasetLabel[] | undefined>;
    /**
     * The extended field, which is of the JsonString type.
     *
     * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
     */
    public readonly options!: pulumi.Output<string | undefined>;
    /**
     * The properties of the dataset. The following values are supported:
     * - FILE: FILE.
     * - DIRECTORY: folder.
     */
    public readonly property!: pulumi.Output<string>;
    /**
     * The data source ID.
     * - When the SourceType is USER, SourceId can be customized.
     * - When SourceType is ITAG, that is, when the iTAG module labels the data set generated by the result, SourceId is the task ID of ITAG.
     * - When SourceType is PAI_PUBLIC_DATASET, that is, a dataset created using PAI public datasets, SourceId is empty by default.
     */
    public readonly sourceId!: pulumi.Output<string | undefined>;
    /**
     * The data source type. The default value is USER. The following values are supported:
     * - PAI-PUBLIC-DATASET:PAI public dataset.
     * - ITAG: The dataset generated by the iTAG module annotation result.
     * - USER: The data set registered by the USER.
     */
    public readonly sourceType!: pulumi.Output<string>;
    /**
     * The Uri configuration sample is as follows:
     * - The data source type is OSS:'oss:// bucket.endpoint/object'
     * - The data source type is NAS:
     *
     * The general NAS format is: 'nas://.region/subpath/to/dir/';
     *
     * CPFS1.0:'nas://.region/subpath/to/dir /';
     *
     * CPFS2.0:'nas://.region//'.
     *
     * CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
     */
    public readonly uri!: pulumi.Output<string>;
    /**
     * The ID of the dataset owner.
     */
    public readonly userId!: pulumi.Output<string>;
    /**
     * The ID of the workspace where the dataset is located. For details about how to obtain the workspace ID, see ListWorkspaces.
     *
     * If this parameter is not configured, the default workspace is used. If the default workspace does not exist, an error is reported.
     */
    public readonly workspaceId!: pulumi.Output<string>;

    /**
     * Create a WorkspaceDataset resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkspaceDatasetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkspaceDatasetArgs | WorkspaceDatasetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkspaceDatasetState | undefined;
            resourceInputs["accessibility"] = state ? state.accessibility : undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["dataSourceType"] = state ? state.dataSourceType : undefined;
            resourceInputs["dataType"] = state ? state.dataType : undefined;
            resourceInputs["datasetName"] = state ? state.datasetName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["property"] = state ? state.property : undefined;
            resourceInputs["sourceId"] = state ? state.sourceId : undefined;
            resourceInputs["sourceType"] = state ? state.sourceType : undefined;
            resourceInputs["uri"] = state ? state.uri : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as WorkspaceDatasetArgs | undefined;
            if ((!args || args.dataSourceType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataSourceType'");
            }
            if ((!args || args.datasetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'datasetName'");
            }
            if ((!args || args.property === undefined) && !opts.urn) {
                throw new Error("Missing required property 'property'");
            }
            if ((!args || args.uri === undefined) && !opts.urn) {
                throw new Error("Missing required property 'uri'");
            }
            if ((!args || args.workspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspaceId'");
            }
            resourceInputs["accessibility"] = args ? args.accessibility : undefined;
            resourceInputs["dataSourceType"] = args ? args.dataSourceType : undefined;
            resourceInputs["dataType"] = args ? args.dataType : undefined;
            resourceInputs["datasetName"] = args ? args.datasetName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["options"] = args ? args.options : undefined;
            resourceInputs["property"] = args ? args.property : undefined;
            resourceInputs["sourceId"] = args ? args.sourceId : undefined;
            resourceInputs["sourceType"] = args ? args.sourceType : undefined;
            resourceInputs["uri"] = args ? args.uri : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkspaceDataset.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkspaceDataset resources.
 */
export interface WorkspaceDatasetState {
    /**
     * Workspace visibility. The following values are supported:
     * - PRIVATE (default): indicates that the workspace is visible to itself and the administrator.
     * - PUBLIC: The workspace is visible to all users.
     */
    accessibility?: pulumi.Input<string>;
    /**
     * The creation time of the resource
     */
    createTime?: pulumi.Input<string>;
    /**
     * The data source type. The following values are supported:
     * - OSS: Alibaba Cloud Object Storage (OSS).
     * - NAS: Alibaba cloud file storage (NAS).
     */
    dataSourceType?: pulumi.Input<string>;
    /**
     * The dataset type. The default value is COMMON. The following values are supported:
     * - COMMON: COMMON.
     * - PIC: picture.
     * - TEXT: TEXT.
     * - VIDEO: VIDEO.
     * - AUDIO: AUDIO.
     */
    dataType?: pulumi.Input<string>;
    /**
     * The name of the dataset. The naming rules are as follows:
     * - Start with a lowercase letter, uppercase letter, number, or Chinese.
     * - Can contain an underscore (_) or a dash (-).
     * - 1~127 characters in length.
     */
    datasetName?: pulumi.Input<string>;
    /**
     * Custom descriptions of datasets to distinguish between different datasets.
     */
    description?: pulumi.Input<string>;
    /**
     * Labels added to the dataset See `labels` below.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.pai.WorkspaceDatasetLabel>[]>;
    /**
     * The extended field, which is of the JsonString type.
     *
     * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
     */
    options?: pulumi.Input<string>;
    /**
     * The properties of the dataset. The following values are supported:
     * - FILE: FILE.
     * - DIRECTORY: folder.
     */
    property?: pulumi.Input<string>;
    /**
     * The data source ID.
     * - When the SourceType is USER, SourceId can be customized.
     * - When SourceType is ITAG, that is, when the iTAG module labels the data set generated by the result, SourceId is the task ID of ITAG.
     * - When SourceType is PAI_PUBLIC_DATASET, that is, a dataset created using PAI public datasets, SourceId is empty by default.
     */
    sourceId?: pulumi.Input<string>;
    /**
     * The data source type. The default value is USER. The following values are supported:
     * - PAI-PUBLIC-DATASET:PAI public dataset.
     * - ITAG: The dataset generated by the iTAG module annotation result.
     * - USER: The data set registered by the USER.
     */
    sourceType?: pulumi.Input<string>;
    /**
     * The Uri configuration sample is as follows:
     * - The data source type is OSS:'oss:// bucket.endpoint/object'
     * - The data source type is NAS:
     *
     * The general NAS format is: 'nas://.region/subpath/to/dir/';
     *
     * CPFS1.0:'nas://.region/subpath/to/dir /';
     *
     * CPFS2.0:'nas://.region//'.
     *
     * CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
     */
    uri?: pulumi.Input<string>;
    /**
     * The ID of the dataset owner.
     */
    userId?: pulumi.Input<string>;
    /**
     * The ID of the workspace where the dataset is located. For details about how to obtain the workspace ID, see ListWorkspaces.
     *
     * If this parameter is not configured, the default workspace is used. If the default workspace does not exist, an error is reported.
     */
    workspaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkspaceDataset resource.
 */
export interface WorkspaceDatasetArgs {
    /**
     * Workspace visibility. The following values are supported:
     * - PRIVATE (default): indicates that the workspace is visible to itself and the administrator.
     * - PUBLIC: The workspace is visible to all users.
     */
    accessibility?: pulumi.Input<string>;
    /**
     * The data source type. The following values are supported:
     * - OSS: Alibaba Cloud Object Storage (OSS).
     * - NAS: Alibaba cloud file storage (NAS).
     */
    dataSourceType: pulumi.Input<string>;
    /**
     * The dataset type. The default value is COMMON. The following values are supported:
     * - COMMON: COMMON.
     * - PIC: picture.
     * - TEXT: TEXT.
     * - VIDEO: VIDEO.
     * - AUDIO: AUDIO.
     */
    dataType?: pulumi.Input<string>;
    /**
     * The name of the dataset. The naming rules are as follows:
     * - Start with a lowercase letter, uppercase letter, number, or Chinese.
     * - Can contain an underscore (_) or a dash (-).
     * - 1~127 characters in length.
     */
    datasetName: pulumi.Input<string>;
    /**
     * Custom descriptions of datasets to distinguish between different datasets.
     */
    description?: pulumi.Input<string>;
    /**
     * Labels added to the dataset See `labels` below.
     */
    labels?: pulumi.Input<pulumi.Input<inputs.pai.WorkspaceDatasetLabel>[]>;
    /**
     * The extended field, which is of the JsonString type.
     *
     * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
     */
    options?: pulumi.Input<string>;
    /**
     * The properties of the dataset. The following values are supported:
     * - FILE: FILE.
     * - DIRECTORY: folder.
     */
    property: pulumi.Input<string>;
    /**
     * The data source ID.
     * - When the SourceType is USER, SourceId can be customized.
     * - When SourceType is ITAG, that is, when the iTAG module labels the data set generated by the result, SourceId is the task ID of ITAG.
     * - When SourceType is PAI_PUBLIC_DATASET, that is, a dataset created using PAI public datasets, SourceId is empty by default.
     */
    sourceId?: pulumi.Input<string>;
    /**
     * The data source type. The default value is USER. The following values are supported:
     * - PAI-PUBLIC-DATASET:PAI public dataset.
     * - ITAG: The dataset generated by the iTAG module annotation result.
     * - USER: The data set registered by the USER.
     */
    sourceType?: pulumi.Input<string>;
    /**
     * The Uri configuration sample is as follows:
     * - The data source type is OSS:'oss:// bucket.endpoint/object'
     * - The data source type is NAS:
     *
     * The general NAS format is: 'nas://.region/subpath/to/dir/';
     *
     * CPFS1.0:'nas://.region/subpath/to/dir /';
     *
     * CPFS2.0:'nas://.region//'.
     *
     * CPFS1.0 and CPFS2.0 are distinguished by the format of fsid: CPFS1.0 is cpfs-;CPFS2.0 is cpfs-.
     */
    uri: pulumi.Input<string>;
    /**
     * The ID of the dataset owner.
     */
    userId?: pulumi.Input<string>;
    /**
     * The ID of the workspace where the dataset is located. For details about how to obtain the workspace ID, see ListWorkspaces.
     *
     * If this parameter is not configured, the default workspace is used. If the default workspace does not exist, an error is reported.
     */
    workspaceId: pulumi.Input<string>;
}
