// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDesktopsDesktop {
    /**
     * @return The number of CPUs.
     * 
     */
    private Integer cpu;
    /**
     * @return The creation time of the Desktop.
     * 
     */
    private String createTime;
    /**
     * @return The desktop id of the Desktop.
     * 
     */
    private String desktopId;
    /**
     * @return The desktop name of the Desktop.
     * 
     */
    private String desktopName;
    /**
     * @return The desktop type of the Desktop.
     * 
     */
    private String desktopType;
    /**
     * @return The directory id of the Desktop.
     * 
     */
    private String directoryId;
    /**
     * @return The desktop end user id of the Desktop.
     * 
     */
    private List<String> endUserIds;
    /**
     * @return The expired time of the Desktop.
     * 
     */
    private String expiredTime;
    /**
     * @return The ID of the Desktop.
     * 
     */
    private String id;
    /**
     * @return The image id of the Desktop.
     * 
     */
    private String imageId;
    /**
     * @return The memory of the Desktop.
     * 
     */
    private String memory;
    /**
     * @return The network interface id of the Desktop.
     * 
     */
    private String networkInterfaceId;
    /**
     * @return The payment type of the Desktop.
     * 
     */
    private String paymentType;
    /**
     * @return The policy group id of the Desktop.
     * 
     */
    private String policyGroupId;
    /**
     * @return The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     * 
     */
    private String status;
    /**
     * @return The system disk size of the Desktop.
     * 
     */
    private Integer systemDiskSize;

    private GetDesktopsDesktop() {}
    /**
     * @return The number of CPUs.
     * 
     */
    public Integer cpu() {
        return this.cpu;
    }
    /**
     * @return The creation time of the Desktop.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The desktop id of the Desktop.
     * 
     */
    public String desktopId() {
        return this.desktopId;
    }
    /**
     * @return The desktop name of the Desktop.
     * 
     */
    public String desktopName() {
        return this.desktopName;
    }
    /**
     * @return The desktop type of the Desktop.
     * 
     */
    public String desktopType() {
        return this.desktopType;
    }
    /**
     * @return The directory id of the Desktop.
     * 
     */
    public String directoryId() {
        return this.directoryId;
    }
    /**
     * @return The desktop end user id of the Desktop.
     * 
     */
    public List<String> endUserIds() {
        return this.endUserIds;
    }
    /**
     * @return The expired time of the Desktop.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return The ID of the Desktop.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The image id of the Desktop.
     * 
     */
    public String imageId() {
        return this.imageId;
    }
    /**
     * @return The memory of the Desktop.
     * 
     */
    public String memory() {
        return this.memory;
    }
    /**
     * @return The network interface id of the Desktop.
     * 
     */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * @return The payment type of the Desktop.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return The policy group id of the Desktop.
     * 
     */
    public String policyGroupId() {
        return this.policyGroupId;
    }
    /**
     * @return The status of the Desktop. Valid values: `Deleted`, `Expired`, `Pending`, `Running`, `Starting`, `Stopped`, `Stopping`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The system disk size of the Desktop.
     * 
     */
    public Integer systemDiskSize() {
        return this.systemDiskSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDesktopsDesktop defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer cpu;
        private String createTime;
        private String desktopId;
        private String desktopName;
        private String desktopType;
        private String directoryId;
        private List<String> endUserIds;
        private String expiredTime;
        private String id;
        private String imageId;
        private String memory;
        private String networkInterfaceId;
        private String paymentType;
        private String policyGroupId;
        private String status;
        private Integer systemDiskSize;
        public Builder() {}
        public Builder(GetDesktopsDesktop defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.createTime = defaults.createTime;
    	      this.desktopId = defaults.desktopId;
    	      this.desktopName = defaults.desktopName;
    	      this.desktopType = defaults.desktopType;
    	      this.directoryId = defaults.directoryId;
    	      this.endUserIds = defaults.endUserIds;
    	      this.expiredTime = defaults.expiredTime;
    	      this.id = defaults.id;
    	      this.imageId = defaults.imageId;
    	      this.memory = defaults.memory;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.paymentType = defaults.paymentType;
    	      this.policyGroupId = defaults.policyGroupId;
    	      this.status = defaults.status;
    	      this.systemDiskSize = defaults.systemDiskSize;
        }

        @CustomType.Setter
        public Builder cpu(Integer cpu) {
            if (cpu == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "cpu");
            }
            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder desktopId(String desktopId) {
            if (desktopId == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "desktopId");
            }
            this.desktopId = desktopId;
            return this;
        }
        @CustomType.Setter
        public Builder desktopName(String desktopName) {
            if (desktopName == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "desktopName");
            }
            this.desktopName = desktopName;
            return this;
        }
        @CustomType.Setter
        public Builder desktopType(String desktopType) {
            if (desktopType == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "desktopType");
            }
            this.desktopType = desktopType;
            return this;
        }
        @CustomType.Setter
        public Builder directoryId(String directoryId) {
            if (directoryId == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "directoryId");
            }
            this.directoryId = directoryId;
            return this;
        }
        @CustomType.Setter
        public Builder endUserIds(List<String> endUserIds) {
            if (endUserIds == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "endUserIds");
            }
            this.endUserIds = endUserIds;
            return this;
        }
        public Builder endUserIds(String... endUserIds) {
            return endUserIds(List.of(endUserIds));
        }
        @CustomType.Setter
        public Builder expiredTime(String expiredTime) {
            if (expiredTime == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "expiredTime");
            }
            this.expiredTime = expiredTime;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder imageId(String imageId) {
            if (imageId == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "imageId");
            }
            this.imageId = imageId;
            return this;
        }
        @CustomType.Setter
        public Builder memory(String memory) {
            if (memory == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "memory");
            }
            this.memory = memory;
            return this;
        }
        @CustomType.Setter
        public Builder networkInterfaceId(String networkInterfaceId) {
            if (networkInterfaceId == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "networkInterfaceId");
            }
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        @CustomType.Setter
        public Builder paymentType(String paymentType) {
            if (paymentType == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "paymentType");
            }
            this.paymentType = paymentType;
            return this;
        }
        @CustomType.Setter
        public Builder policyGroupId(String policyGroupId) {
            if (policyGroupId == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "policyGroupId");
            }
            this.policyGroupId = policyGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder systemDiskSize(Integer systemDiskSize) {
            if (systemDiskSize == null) {
              throw new MissingRequiredPropertyException("GetDesktopsDesktop", "systemDiskSize");
            }
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public GetDesktopsDesktop build() {
            final var _resultValue = new GetDesktopsDesktop();
            _resultValue.cpu = cpu;
            _resultValue.createTime = createTime;
            _resultValue.desktopId = desktopId;
            _resultValue.desktopName = desktopName;
            _resultValue.desktopType = desktopType;
            _resultValue.directoryId = directoryId;
            _resultValue.endUserIds = endUserIds;
            _resultValue.expiredTime = expiredTime;
            _resultValue.id = id;
            _resultValue.imageId = imageId;
            _resultValue.memory = memory;
            _resultValue.networkInterfaceId = networkInterfaceId;
            _resultValue.paymentType = paymentType;
            _resultValue.policyGroupId = policyGroupId;
            _resultValue.status = status;
            _resultValue.systemDiskSize = systemDiskSize;
            return _resultValue;
        }
    }
}