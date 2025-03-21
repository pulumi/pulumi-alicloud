// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pai;

import com.pulumi.alicloud.pai.inputs.WorkspaceDatasetLabelArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkspaceDatasetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkspaceDatasetArgs Empty = new WorkspaceDatasetArgs();

    /**
     * Workspace visibility. The following values are supported:
     * - PRIVATE (default): indicates that the workspace is visible to itself and the administrator.
     * - PUBLIC: The workspace is visible to all users.
     * 
     */
    @Import(name="accessibility")
    private @Nullable Output<String> accessibility;

    /**
     * @return Workspace visibility. The following values are supported:
     * - PRIVATE (default): indicates that the workspace is visible to itself and the administrator.
     * - PUBLIC: The workspace is visible to all users.
     * 
     */
    public Optional<Output<String>> accessibility() {
        return Optional.ofNullable(this.accessibility);
    }

    /**
     * The data source type. The following values are supported:
     * - OSS: Alibaba Cloud Object Storage (OSS).
     * - NAS: Alibaba cloud file storage (NAS).
     * 
     */
    @Import(name="dataSourceType", required=true)
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
     * The dataset type. The default value is COMMON. The following values are supported:
     * - COMMON: COMMON.
     * - PIC: picture.
     * - TEXT: TEXT.
     * - VIDEO: VIDEO.
     * - AUDIO: AUDIO.
     * 
     */
    @Import(name="dataType")
    private @Nullable Output<String> dataType;

    /**
     * @return The dataset type. The default value is COMMON. The following values are supported:
     * - COMMON: COMMON.
     * - PIC: picture.
     * - TEXT: TEXT.
     * - VIDEO: VIDEO.
     * - AUDIO: AUDIO.
     * 
     */
    public Optional<Output<String>> dataType() {
        return Optional.ofNullable(this.dataType);
    }

    /**
     * The name of the dataset. The naming rules are as follows:
     * - Start with a lowercase letter, uppercase letter, number, or Chinese.
     * - Can contain an underscore (_) or a dash (-).
     * - 1~127 characters in length.
     * 
     */
    @Import(name="datasetName", required=true)
    private Output<String> datasetName;

    /**
     * @return The name of the dataset. The naming rules are as follows:
     * - Start with a lowercase letter, uppercase letter, number, or Chinese.
     * - Can contain an underscore (_) or a dash (-).
     * - 1~127 characters in length.
     * 
     */
    public Output<String> datasetName() {
        return this.datasetName;
    }

    /**
     * Custom descriptions of datasets to distinguish between different datasets.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Custom descriptions of datasets to distinguish between different datasets.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Labels added to the dataset See `labels` below.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<List<WorkspaceDatasetLabelArgs>> labels;

    /**
     * @return Labels added to the dataset See `labels` below.
     * 
     */
    public Optional<Output<List<WorkspaceDatasetLabelArgs>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The extended field, which is of the JsonString type.
     * 
     * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
     * 
     */
    @Import(name="options")
    private @Nullable Output<String> options;

    /**
     * @return The extended field, which is of the JsonString type.
     * 
     * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
     * 
     */
    public Optional<Output<String>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The properties of the dataset. The following values are supported:
     * - FILE: FILE.
     * - DIRECTORY: folder.
     * 
     */
    @Import(name="property", required=true)
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
     * - When the SourceType is USER, SourceId can be customized.
     * - When SourceType is ITAG, that is, when the iTAG module labels the data set generated by the result, SourceId is the task ID of ITAG.
     * - When SourceType is PAI_PUBLIC_DATASET, that is, a dataset created using PAI public datasets, SourceId is empty by default.
     * 
     */
    @Import(name="sourceId")
    private @Nullable Output<String> sourceId;

    /**
     * @return The data source ID.
     * - When the SourceType is USER, SourceId can be customized.
     * - When SourceType is ITAG, that is, when the iTAG module labels the data set generated by the result, SourceId is the task ID of ITAG.
     * - When SourceType is PAI_PUBLIC_DATASET, that is, a dataset created using PAI public datasets, SourceId is empty by default.
     * 
     */
    public Optional<Output<String>> sourceId() {
        return Optional.ofNullable(this.sourceId);
    }

    /**
     * The data source type. The default value is USER. The following values are supported:
     * - PAI-PUBLIC-DATASET:PAI public dataset.
     * - ITAG: The dataset generated by the iTAG module annotation result.
     * - USER: The data set registered by the USER.
     * 
     */
    @Import(name="sourceType")
    private @Nullable Output<String> sourceType;

    /**
     * @return The data source type. The default value is USER. The following values are supported:
     * - PAI-PUBLIC-DATASET:PAI public dataset.
     * - ITAG: The dataset generated by the iTAG module annotation result.
     * - USER: The data set registered by the USER.
     * 
     */
    public Optional<Output<String>> sourceType() {
        return Optional.ofNullable(this.sourceType);
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
    @Import(name="uri", required=true)
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
     * The ID of the dataset owner.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return The ID of the dataset owner.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    /**
     * The ID of the workspace where the dataset is located. For details about how to obtain the workspace ID, see ListWorkspaces.
     * 
     * If this parameter is not configured, the default workspace is used. If the default workspace does not exist, an error is reported.
     * 
     */
    @Import(name="workspaceId", required=true)
    private Output<String> workspaceId;

    /**
     * @return The ID of the workspace where the dataset is located. For details about how to obtain the workspace ID, see ListWorkspaces.
     * 
     * If this parameter is not configured, the default workspace is used. If the default workspace does not exist, an error is reported.
     * 
     */
    public Output<String> workspaceId() {
        return this.workspaceId;
    }

    private WorkspaceDatasetArgs() {}

    private WorkspaceDatasetArgs(WorkspaceDatasetArgs $) {
        this.accessibility = $.accessibility;
        this.dataSourceType = $.dataSourceType;
        this.dataType = $.dataType;
        this.datasetName = $.datasetName;
        this.description = $.description;
        this.labels = $.labels;
        this.options = $.options;
        this.property = $.property;
        this.sourceId = $.sourceId;
        this.sourceType = $.sourceType;
        this.uri = $.uri;
        this.userId = $.userId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceDatasetArgs $;

        public Builder() {
            $ = new WorkspaceDatasetArgs();
        }

        public Builder(WorkspaceDatasetArgs defaults) {
            $ = new WorkspaceDatasetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessibility Workspace visibility. The following values are supported:
         * - PRIVATE (default): indicates that the workspace is visible to itself and the administrator.
         * - PUBLIC: The workspace is visible to all users.
         * 
         * @return builder
         * 
         */
        public Builder accessibility(@Nullable Output<String> accessibility) {
            $.accessibility = accessibility;
            return this;
        }

        /**
         * @param accessibility Workspace visibility. The following values are supported:
         * - PRIVATE (default): indicates that the workspace is visible to itself and the administrator.
         * - PUBLIC: The workspace is visible to all users.
         * 
         * @return builder
         * 
         */
        public Builder accessibility(String accessibility) {
            return accessibility(Output.of(accessibility));
        }

        /**
         * @param dataSourceType The data source type. The following values are supported:
         * - OSS: Alibaba Cloud Object Storage (OSS).
         * - NAS: Alibaba cloud file storage (NAS).
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(Output<String> dataSourceType) {
            $.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * @param dataSourceType The data source type. The following values are supported:
         * - OSS: Alibaba Cloud Object Storage (OSS).
         * - NAS: Alibaba cloud file storage (NAS).
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(String dataSourceType) {
            return dataSourceType(Output.of(dataSourceType));
        }

        /**
         * @param dataType The dataset type. The default value is COMMON. The following values are supported:
         * - COMMON: COMMON.
         * - PIC: picture.
         * - TEXT: TEXT.
         * - VIDEO: VIDEO.
         * - AUDIO: AUDIO.
         * 
         * @return builder
         * 
         */
        public Builder dataType(@Nullable Output<String> dataType) {
            $.dataType = dataType;
            return this;
        }

        /**
         * @param dataType The dataset type. The default value is COMMON. The following values are supported:
         * - COMMON: COMMON.
         * - PIC: picture.
         * - TEXT: TEXT.
         * - VIDEO: VIDEO.
         * - AUDIO: AUDIO.
         * 
         * @return builder
         * 
         */
        public Builder dataType(String dataType) {
            return dataType(Output.of(dataType));
        }

        /**
         * @param datasetName The name of the dataset. The naming rules are as follows:
         * - Start with a lowercase letter, uppercase letter, number, or Chinese.
         * - Can contain an underscore (_) or a dash (-).
         * - 1~127 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder datasetName(Output<String> datasetName) {
            $.datasetName = datasetName;
            return this;
        }

        /**
         * @param datasetName The name of the dataset. The naming rules are as follows:
         * - Start with a lowercase letter, uppercase letter, number, or Chinese.
         * - Can contain an underscore (_) or a dash (-).
         * - 1~127 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder datasetName(String datasetName) {
            return datasetName(Output.of(datasetName));
        }

        /**
         * @param description Custom descriptions of datasets to distinguish between different datasets.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Custom descriptions of datasets to distinguish between different datasets.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param labels Labels added to the dataset See `labels` below.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<List<WorkspaceDatasetLabelArgs>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels added to the dataset See `labels` below.
         * 
         * @return builder
         * 
         */
        public Builder labels(List<WorkspaceDatasetLabelArgs> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param labels Labels added to the dataset See `labels` below.
         * 
         * @return builder
         * 
         */
        public Builder labels(WorkspaceDatasetLabelArgs... labels) {
            return labels(List.of(labels));
        }

        /**
         * @param options The extended field, which is of the JsonString type.
         * 
         * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<String> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options The extended field, which is of the JsonString type.
         * 
         * When DLC uses a dataset, you can specify the default Mount path for the dataset by configuring the mountPath field.
         * 
         * @return builder
         * 
         */
        public Builder options(String options) {
            return options(Output.of(options));
        }

        /**
         * @param property The properties of the dataset. The following values are supported:
         * - FILE: FILE.
         * - DIRECTORY: folder.
         * 
         * @return builder
         * 
         */
        public Builder property(Output<String> property) {
            $.property = property;
            return this;
        }

        /**
         * @param property The properties of the dataset. The following values are supported:
         * - FILE: FILE.
         * - DIRECTORY: folder.
         * 
         * @return builder
         * 
         */
        public Builder property(String property) {
            return property(Output.of(property));
        }

        /**
         * @param sourceId The data source ID.
         * - When the SourceType is USER, SourceId can be customized.
         * - When SourceType is ITAG, that is, when the iTAG module labels the data set generated by the result, SourceId is the task ID of ITAG.
         * - When SourceType is PAI_PUBLIC_DATASET, that is, a dataset created using PAI public datasets, SourceId is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(@Nullable Output<String> sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        /**
         * @param sourceId The data source ID.
         * - When the SourceType is USER, SourceId can be customized.
         * - When SourceType is ITAG, that is, when the iTAG module labels the data set generated by the result, SourceId is the task ID of ITAG.
         * - When SourceType is PAI_PUBLIC_DATASET, that is, a dataset created using PAI public datasets, SourceId is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder sourceId(String sourceId) {
            return sourceId(Output.of(sourceId));
        }

        /**
         * @param sourceType The data source type. The default value is USER. The following values are supported:
         * - PAI-PUBLIC-DATASET:PAI public dataset.
         * - ITAG: The dataset generated by the iTAG module annotation result.
         * - USER: The data set registered by the USER.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(@Nullable Output<String> sourceType) {
            $.sourceType = sourceType;
            return this;
        }

        /**
         * @param sourceType The data source type. The default value is USER. The following values are supported:
         * - PAI-PUBLIC-DATASET:PAI public dataset.
         * - ITAG: The dataset generated by the iTAG module annotation result.
         * - USER: The data set registered by the USER.
         * 
         * @return builder
         * 
         */
        public Builder sourceType(String sourceType) {
            return sourceType(Output.of(sourceType));
        }

        /**
         * @param uri The Uri configuration sample is as follows:
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
         * @return builder
         * 
         */
        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param uri The Uri configuration sample is as follows:
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
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        /**
         * @param userId The ID of the dataset owner.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId The ID of the dataset owner.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        /**
         * @param workspaceId The ID of the workspace where the dataset is located. For details about how to obtain the workspace ID, see ListWorkspaces.
         * 
         * If this parameter is not configured, the default workspace is used. If the default workspace does not exist, an error is reported.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId The ID of the workspace where the dataset is located. For details about how to obtain the workspace ID, see ListWorkspaces.
         * 
         * If this parameter is not configured, the default workspace is used. If the default workspace does not exist, an error is reported.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public WorkspaceDatasetArgs build() {
            if ($.dataSourceType == null) {
                throw new MissingRequiredPropertyException("WorkspaceDatasetArgs", "dataSourceType");
            }
            if ($.datasetName == null) {
                throw new MissingRequiredPropertyException("WorkspaceDatasetArgs", "datasetName");
            }
            if ($.property == null) {
                throw new MissingRequiredPropertyException("WorkspaceDatasetArgs", "property");
            }
            if ($.uri == null) {
                throw new MissingRequiredPropertyException("WorkspaceDatasetArgs", "uri");
            }
            if ($.workspaceId == null) {
                throw new MissingRequiredPropertyException("WorkspaceDatasetArgs", "workspaceId");
            }
            return $;
        }
    }

}
