// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.emrv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterNodeGroupAckConfigPvc {
    /**
     * @return The ack cluster job pod data disk size of persistent volume claim.
     * 
     */
    private Integer dataDiskSize;
    /**
     * @return The ack cluster job pod data disk storage class of persistent volume claim.
     * 
     */
    private String dataDiskStorageClass;
    /**
     * @return The name of ack cluster job pod volume mounts.
     * 
     */
    private String name;
    /**
     * @return The path of ack cluster job pod volume mounts.
     * 
     */
    private String path;

    private ClusterNodeGroupAckConfigPvc() {}
    /**
     * @return The ack cluster job pod data disk size of persistent volume claim.
     * 
     */
    public Integer dataDiskSize() {
        return this.dataDiskSize;
    }
    /**
     * @return The ack cluster job pod data disk storage class of persistent volume claim.
     * 
     */
    public String dataDiskStorageClass() {
        return this.dataDiskStorageClass;
    }
    /**
     * @return The name of ack cluster job pod volume mounts.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The path of ack cluster job pod volume mounts.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeGroupAckConfigPvc defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer dataDiskSize;
        private String dataDiskStorageClass;
        private String name;
        private String path;
        public Builder() {}
        public Builder(ClusterNodeGroupAckConfigPvc defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataDiskSize = defaults.dataDiskSize;
    	      this.dataDiskStorageClass = defaults.dataDiskStorageClass;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder dataDiskSize(Integer dataDiskSize) {
            if (dataDiskSize == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAckConfigPvc", "dataDiskSize");
            }
            this.dataDiskSize = dataDiskSize;
            return this;
        }
        @CustomType.Setter
        public Builder dataDiskStorageClass(String dataDiskStorageClass) {
            if (dataDiskStorageClass == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAckConfigPvc", "dataDiskStorageClass");
            }
            this.dataDiskStorageClass = dataDiskStorageClass;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            if (name == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAckConfigPvc", "name");
            }
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            if (path == null) {
              throw new MissingRequiredPropertyException("ClusterNodeGroupAckConfigPvc", "path");
            }
            this.path = path;
            return this;
        }
        public ClusterNodeGroupAckConfigPvc build() {
            final var _resultValue = new ClusterNodeGroupAckConfigPvc();
            _resultValue.dataDiskSize = dataDiskSize;
            _resultValue.dataDiskStorageClass = dataDiskStorageClass;
            _resultValue.name = name;
            _resultValue.path = path;
            return _resultValue;
        }
    }
}