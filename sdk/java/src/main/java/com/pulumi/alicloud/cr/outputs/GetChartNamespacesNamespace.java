// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cr.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetChartNamespacesNamespace {
    /**
     * @return Indicates whether a repository is automatically created when an image is pushed to the namespace.
     * 
     */
    private final Boolean autoCreateRepo;
    /**
     * @return The ID of the namespace.
     * 
     */
    private final String chartNamespaceId;
    /**
     * @return The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
     * 
     */
    private final String defaultRepoType;
    /**
     * @return The ID of the Chart Namespace.
     * 
     */
    private final String id;
    /**
     * @return The ID of the namespace.
     * 
     */
    private final String instanceId;
    /**
     * @return The name of the namespace.
     * 
     */
    private final String namespaceName;

    @CustomType.Constructor
    private GetChartNamespacesNamespace(
        @CustomType.Parameter("autoCreateRepo") Boolean autoCreateRepo,
        @CustomType.Parameter("chartNamespaceId") String chartNamespaceId,
        @CustomType.Parameter("defaultRepoType") String defaultRepoType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("namespaceName") String namespaceName) {
        this.autoCreateRepo = autoCreateRepo;
        this.chartNamespaceId = chartNamespaceId;
        this.defaultRepoType = defaultRepoType;
        this.id = id;
        this.instanceId = instanceId;
        this.namespaceName = namespaceName;
    }

    /**
     * @return Indicates whether a repository is automatically created when an image is pushed to the namespace.
     * 
     */
    public Boolean autoCreateRepo() {
        return this.autoCreateRepo;
    }
    /**
     * @return The ID of the namespace.
     * 
     */
    public String chartNamespaceId() {
        return this.chartNamespaceId;
    }
    /**
     * @return The default repository type. Valid values: `PUBLIC`,`PRIVATE`.
     * 
     */
    public String defaultRepoType() {
        return this.defaultRepoType;
    }
    /**
     * @return The ID of the Chart Namespace.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the namespace.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return The name of the namespace.
     * 
     */
    public String namespaceName() {
        return this.namespaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChartNamespacesNamespace defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreateRepo;
        private String chartNamespaceId;
        private String defaultRepoType;
        private String id;
        private String instanceId;
        private String namespaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChartNamespacesNamespace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateRepo = defaults.autoCreateRepo;
    	      this.chartNamespaceId = defaults.chartNamespaceId;
    	      this.defaultRepoType = defaults.defaultRepoType;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.namespaceName = defaults.namespaceName;
        }

        public Builder autoCreateRepo(Boolean autoCreateRepo) {
            this.autoCreateRepo = Objects.requireNonNull(autoCreateRepo);
            return this;
        }
        public Builder chartNamespaceId(String chartNamespaceId) {
            this.chartNamespaceId = Objects.requireNonNull(chartNamespaceId);
            return this;
        }
        public Builder defaultRepoType(String defaultRepoType) {
            this.defaultRepoType = Objects.requireNonNull(defaultRepoType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }        public GetChartNamespacesNamespace build() {
            return new GetChartNamespacesNamespace(autoCreateRepo, chartNamespaceId, defaultRepoType, id, instanceId, namespaceName);
        }
    }
}