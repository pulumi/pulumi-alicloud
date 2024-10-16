// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.servicemesh.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetExtensionProvidersProvider {
    /**
     * @return The config of the Service Mesh Extension Provider.
     * 
     */
    private String config;
    /**
     * @return The name of the Service Mesh Extension Provider.
     * 
     */
    private String extensionProviderName;
    /**
     * @return The ID of the Service Mesh Extension Provider. It formats as `&lt;service_mesh_id&gt;:&lt;type&gt;:&lt;extension_provider_name&gt;`.
     * 
     */
    private String id;
    /**
     * @return The ID of the Service Mesh.
     * 
     */
    private String serviceMeshId;
    /**
     * @return The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
     * 
     */
    private String type;

    private GetExtensionProvidersProvider() {}
    /**
     * @return The config of the Service Mesh Extension Provider.
     * 
     */
    public String config() {
        return this.config;
    }
    /**
     * @return The name of the Service Mesh Extension Provider.
     * 
     */
    public String extensionProviderName() {
        return this.extensionProviderName;
    }
    /**
     * @return The ID of the Service Mesh Extension Provider. It formats as `&lt;service_mesh_id&gt;:&lt;type&gt;:&lt;extension_provider_name&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The ID of the Service Mesh.
     * 
     */
    public String serviceMeshId() {
        return this.serviceMeshId;
    }
    /**
     * @return The type of the Service Mesh Extension Provider. Valid values: `httpextauth`, `grpcextauth`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExtensionProvidersProvider defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String config;
        private String extensionProviderName;
        private String id;
        private String serviceMeshId;
        private String type;
        public Builder() {}
        public Builder(GetExtensionProvidersProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.extensionProviderName = defaults.extensionProviderName;
    	      this.id = defaults.id;
    	      this.serviceMeshId = defaults.serviceMeshId;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder config(String config) {
            if (config == null) {
              throw new MissingRequiredPropertyException("GetExtensionProvidersProvider", "config");
            }
            this.config = config;
            return this;
        }
        @CustomType.Setter
        public Builder extensionProviderName(String extensionProviderName) {
            if (extensionProviderName == null) {
              throw new MissingRequiredPropertyException("GetExtensionProvidersProvider", "extensionProviderName");
            }
            this.extensionProviderName = extensionProviderName;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetExtensionProvidersProvider", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder serviceMeshId(String serviceMeshId) {
            if (serviceMeshId == null) {
              throw new MissingRequiredPropertyException("GetExtensionProvidersProvider", "serviceMeshId");
            }
            this.serviceMeshId = serviceMeshId;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetExtensionProvidersProvider", "type");
            }
            this.type = type;
            return this;
        }
        public GetExtensionProvidersProvider build() {
            final var _resultValue = new GetExtensionProvidersProvider();
            _resultValue.config = config;
            _resultValue.extensionProviderName = extensionProviderName;
            _resultValue.id = id;
            _resultValue.serviceMeshId = serviceMeshId;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
