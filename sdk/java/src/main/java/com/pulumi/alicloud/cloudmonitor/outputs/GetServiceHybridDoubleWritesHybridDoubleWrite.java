// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudmonitor.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServiceHybridDoubleWritesHybridDoubleWrite {
    /**
     * @return The ID of the Hybrid Double Write. It formats as `&lt;source_namespace&gt;:&lt;source_user_id&gt;`.
     * 
     */
    private String id;
    /**
     * @return Target Namespace.
     * 
     */
    private String namespace;
    /**
     * @return Source Namespace.
     * 
     */
    private String sourceNamespace;
    /**
     * @return Source UserId.
     * 
     */
    private String sourceUserId;
    /**
     * @return Target UserId.
     * 
     */
    private String userId;

    private GetServiceHybridDoubleWritesHybridDoubleWrite() {}
    /**
     * @return The ID of the Hybrid Double Write. It formats as `&lt;source_namespace&gt;:&lt;source_user_id&gt;`.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Target Namespace.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return Source Namespace.
     * 
     */
    public String sourceNamespace() {
        return this.sourceNamespace;
    }
    /**
     * @return Source UserId.
     * 
     */
    public String sourceUserId() {
        return this.sourceUserId;
    }
    /**
     * @return Target UserId.
     * 
     */
    public String userId() {
        return this.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceHybridDoubleWritesHybridDoubleWrite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String namespace;
        private String sourceNamespace;
        private String sourceUserId;
        private String userId;
        public Builder() {}
        public Builder(GetServiceHybridDoubleWritesHybridDoubleWrite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
    	      this.sourceNamespace = defaults.sourceNamespace;
    	      this.sourceUserId = defaults.sourceUserId;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesHybridDoubleWrite", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(String namespace) {
            if (namespace == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesHybridDoubleWrite", "namespace");
            }
            this.namespace = namespace;
            return this;
        }
        @CustomType.Setter
        public Builder sourceNamespace(String sourceNamespace) {
            if (sourceNamespace == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesHybridDoubleWrite", "sourceNamespace");
            }
            this.sourceNamespace = sourceNamespace;
            return this;
        }
        @CustomType.Setter
        public Builder sourceUserId(String sourceUserId) {
            if (sourceUserId == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesHybridDoubleWrite", "sourceUserId");
            }
            this.sourceUserId = sourceUserId;
            return this;
        }
        @CustomType.Setter
        public Builder userId(String userId) {
            if (userId == null) {
              throw new MissingRequiredPropertyException("GetServiceHybridDoubleWritesHybridDoubleWrite", "userId");
            }
            this.userId = userId;
            return this;
        }
        public GetServiceHybridDoubleWritesHybridDoubleWrite build() {
            final var _resultValue = new GetServiceHybridDoubleWritesHybridDoubleWrite();
            _resultValue.id = id;
            _resultValue.namespace = namespace;
            _resultValue.sourceNamespace = sourceNamespace;
            _resultValue.sourceUserId = sourceUserId;
            _resultValue.userId = userId;
            return _resultValue;
        }
    }
}