// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dataworks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * Data source connection configuration information, including the connection address, access identity, and environment information. The data source environment EnvType information is a member property of this object, including DEV (Development Environment) and PROD (production environment). The value of EnvType is not case-sensitive.
     * 
     */
    @Import(name="connectionProperties", required=true)
    private Output<String> connectionProperties;

    /**
     * @return Data source connection configuration information, including the connection address, access identity, and environment information. The data source environment EnvType information is a member property of this object, including DEV (Development Environment) and PROD (production environment). The value of EnvType is not case-sensitive.
     * 
     */
    public Output<String> connectionProperties() {
        return this.connectionProperties;
    }

    /**
     * The configuration mode of the data source. Different types of data sources have different configuration modes. For example, MySQL data sources support UrlMode and InstanceMode.
     * 
     */
    @Import(name="connectionPropertiesMode", required=true)
    private Output<String> connectionPropertiesMode;

    /**
     * @return The configuration mode of the data source. Different types of data sources have different configuration modes. For example, MySQL data sources support UrlMode and InstanceMode.
     * 
     */
    public Output<String> connectionPropertiesMode() {
        return this.connectionPropertiesMode;
    }

    /**
     * The data source name. The name of a data source in a specific environment (development environment or production environment) is unique in a project.
     * 
     */
    @Import(name="dataSourceName", required=true)
    private Output<String> dataSourceName;

    /**
     * @return The data source name. The name of a data source in a specific environment (development environment or production environment) is unique in a project.
     * 
     */
    public Output<String> dataSourceName() {
        return this.dataSourceName;
    }

    /**
     * Description of the data source
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the data source
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The ID of the project to which the data source belongs.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<Integer> projectId;

    /**
     * @return The ID of the project to which the data source belongs.
     * 
     */
    public Output<Integer> projectId() {
        return this.projectId;
    }

    /**
     * The type of data source. For a list of data source types, see the values listed in the API documentation.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of data source. For a list of data source types, see the values listed in the API documentation.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private DataSourceArgs() {}

    private DataSourceArgs(DataSourceArgs $) {
        this.connectionProperties = $.connectionProperties;
        this.connectionPropertiesMode = $.connectionPropertiesMode;
        this.dataSourceName = $.dataSourceName;
        this.description = $.description;
        this.projectId = $.projectId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceArgs $;

        public Builder() {
            $ = new DataSourceArgs();
        }

        public Builder(DataSourceArgs defaults) {
            $ = new DataSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionProperties Data source connection configuration information, including the connection address, access identity, and environment information. The data source environment EnvType information is a member property of this object, including DEV (Development Environment) and PROD (production environment). The value of EnvType is not case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder connectionProperties(Output<String> connectionProperties) {
            $.connectionProperties = connectionProperties;
            return this;
        }

        /**
         * @param connectionProperties Data source connection configuration information, including the connection address, access identity, and environment information. The data source environment EnvType information is a member property of this object, including DEV (Development Environment) and PROD (production environment). The value of EnvType is not case-sensitive.
         * 
         * @return builder
         * 
         */
        public Builder connectionProperties(String connectionProperties) {
            return connectionProperties(Output.of(connectionProperties));
        }

        /**
         * @param connectionPropertiesMode The configuration mode of the data source. Different types of data sources have different configuration modes. For example, MySQL data sources support UrlMode and InstanceMode.
         * 
         * @return builder
         * 
         */
        public Builder connectionPropertiesMode(Output<String> connectionPropertiesMode) {
            $.connectionPropertiesMode = connectionPropertiesMode;
            return this;
        }

        /**
         * @param connectionPropertiesMode The configuration mode of the data source. Different types of data sources have different configuration modes. For example, MySQL data sources support UrlMode and InstanceMode.
         * 
         * @return builder
         * 
         */
        public Builder connectionPropertiesMode(String connectionPropertiesMode) {
            return connectionPropertiesMode(Output.of(connectionPropertiesMode));
        }

        /**
         * @param dataSourceName The data source name. The name of a data source in a specific environment (development environment or production environment) is unique in a project.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceName(Output<String> dataSourceName) {
            $.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * @param dataSourceName The data source name. The name of a data source in a specific environment (development environment or production environment) is unique in a project.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceName(String dataSourceName) {
            return dataSourceName(Output.of(dataSourceName));
        }

        /**
         * @param description Description of the data source
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the data source
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param projectId The ID of the project to which the data source belongs.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<Integer> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId The ID of the project to which the data source belongs.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Integer projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param type The type of data source. For a list of data source types, see the values listed in the API documentation.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of data source. For a list of data source types, see the values listed in the API documentation.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public DataSourceArgs build() {
            if ($.connectionProperties == null) {
                throw new MissingRequiredPropertyException("DataSourceArgs", "connectionProperties");
            }
            if ($.connectionPropertiesMode == null) {
                throw new MissingRequiredPropertyException("DataSourceArgs", "connectionPropertiesMode");
            }
            if ($.dataSourceName == null) {
                throw new MissingRequiredPropertyException("DataSourceArgs", "dataSourceName");
            }
            if ($.projectId == null) {
                throw new MissingRequiredPropertyException("DataSourceArgs", "projectId");
            }
            if ($.type == null) {
                throw new MissingRequiredPropertyException("DataSourceArgs", "type");
            }
            return $;
        }
    }

}
