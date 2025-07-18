// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetInstanceTypesInstanceTypeBurstableInstance;
import com.pulumi.alicloud.ecs.outputs.GetInstanceTypesInstanceTypeGpu;
import com.pulumi.alicloud.ecs.outputs.GetInstanceTypesInstanceTypeLocalStorage;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceTypesInstanceType {
    /**
     * @return List of availability zones that support the instance type.
     * 
     */
    private List<String> availabilityZones;
    /**
     * @return The burstable instance attribution.
     * 
     */
    private GetInstanceTypesInstanceTypeBurstableInstance burstableInstance;
    /**
     * @return Filter the results to a specific number of cpu cores.
     * 
     */
    private Integer cpuCoreCount;
    /**
     * @return Filter the result whose network interface number is no more than `eni_amount`.
     * 
     */
    private Integer eniAmount;
    /**
     * @return (Available since v1.239.0) The maximum number of IPv6 addresses per ENI.
     * 
     */
    private Integer eniIpv6AddressQuantity;
    /**
     * @return (Available since v1.239.0) The maximum number of IPv4 addresses per ENI.
     * 
     */
    private Integer eniPrivateIpAddressQuantity;
    /**
     * @return (Available since v1.239.0) The maximum number of ENIs per instance.
     * 
     */
    private Integer eniQuantity;
    /**
     * @return The instance type family.
     * 
     */
    private String family;
    /**
     * @return The GPU attribution of an instance type:
     * 
     */
    private GetInstanceTypesInstanceTypeGpu gpu;
    /**
     * @return ID of the instance type.
     * 
     */
    private String id;
    /**
     * @return Local storage of an instance type.
     * 
     */
    private GetInstanceTypesInstanceTypeLocalStorage localStorage;
    /**
     * @return (Available since v1.239.0) The maximum number of queues per ENI, including primary and secondary ENIs.
     * 
     */
    private Integer maximumQueueNumberPerEni;
    /**
     * @return Filter the results to a specific memory size in GB.
     * 
     */
    private Double memorySize;
    /**
     * @return Indicates whether the cloud disk can be attached by using the nonvolatile memory express (NVMe) protocol.
     * 
     */
    private String nvmeSupport;
    /**
     * @return The price of instance type. **Note:** `price` takes effect only if `sorted_by` is set to `Price`.
     * 
     */
    private String price;
    /**
     * @return (Available since v1.239.0) The default number of queues per primary ENI.
     * 
     */
    private Integer primaryEniQueueNumber;
    /**
     * @return (Available since v1.239.0) The default number of queues per secondary ENI.
     * 
     */
    private Integer secondaryEniQueueNumber;
    /**
     * @return (Available since v1.239.0) The maximum number of queues on ENIs that the instance type supports.
     * 
     */
    private Integer totalEniQueueQuantity;

    private GetInstanceTypesInstanceType() {}
    /**
     * @return List of availability zones that support the instance type.
     * 
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }
    /**
     * @return The burstable instance attribution.
     * 
     */
    public GetInstanceTypesInstanceTypeBurstableInstance burstableInstance() {
        return this.burstableInstance;
    }
    /**
     * @return Filter the results to a specific number of cpu cores.
     * 
     */
    public Integer cpuCoreCount() {
        return this.cpuCoreCount;
    }
    /**
     * @return Filter the result whose network interface number is no more than `eni_amount`.
     * 
     */
    public Integer eniAmount() {
        return this.eniAmount;
    }
    /**
     * @return (Available since v1.239.0) The maximum number of IPv6 addresses per ENI.
     * 
     */
    public Integer eniIpv6AddressQuantity() {
        return this.eniIpv6AddressQuantity;
    }
    /**
     * @return (Available since v1.239.0) The maximum number of IPv4 addresses per ENI.
     * 
     */
    public Integer eniPrivateIpAddressQuantity() {
        return this.eniPrivateIpAddressQuantity;
    }
    /**
     * @return (Available since v1.239.0) The maximum number of ENIs per instance.
     * 
     */
    public Integer eniQuantity() {
        return this.eniQuantity;
    }
    /**
     * @return The instance type family.
     * 
     */
    public String family() {
        return this.family;
    }
    /**
     * @return The GPU attribution of an instance type:
     * 
     */
    public GetInstanceTypesInstanceTypeGpu gpu() {
        return this.gpu;
    }
    /**
     * @return ID of the instance type.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Local storage of an instance type.
     * 
     */
    public GetInstanceTypesInstanceTypeLocalStorage localStorage() {
        return this.localStorage;
    }
    /**
     * @return (Available since v1.239.0) The maximum number of queues per ENI, including primary and secondary ENIs.
     * 
     */
    public Integer maximumQueueNumberPerEni() {
        return this.maximumQueueNumberPerEni;
    }
    /**
     * @return Filter the results to a specific memory size in GB.
     * 
     */
    public Double memorySize() {
        return this.memorySize;
    }
    /**
     * @return Indicates whether the cloud disk can be attached by using the nonvolatile memory express (NVMe) protocol.
     * 
     */
    public String nvmeSupport() {
        return this.nvmeSupport;
    }
    /**
     * @return The price of instance type. **Note:** `price` takes effect only if `sorted_by` is set to `Price`.
     * 
     */
    public String price() {
        return this.price;
    }
    /**
     * @return (Available since v1.239.0) The default number of queues per primary ENI.
     * 
     */
    public Integer primaryEniQueueNumber() {
        return this.primaryEniQueueNumber;
    }
    /**
     * @return (Available since v1.239.0) The default number of queues per secondary ENI.
     * 
     */
    public Integer secondaryEniQueueNumber() {
        return this.secondaryEniQueueNumber;
    }
    /**
     * @return (Available since v1.239.0) The maximum number of queues on ENIs that the instance type supports.
     * 
     */
    public Integer totalEniQueueQuantity() {
        return this.totalEniQueueQuantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTypesInstanceType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> availabilityZones;
        private GetInstanceTypesInstanceTypeBurstableInstance burstableInstance;
        private Integer cpuCoreCount;
        private Integer eniAmount;
        private Integer eniIpv6AddressQuantity;
        private Integer eniPrivateIpAddressQuantity;
        private Integer eniQuantity;
        private String family;
        private GetInstanceTypesInstanceTypeGpu gpu;
        private String id;
        private GetInstanceTypesInstanceTypeLocalStorage localStorage;
        private Integer maximumQueueNumberPerEni;
        private Double memorySize;
        private String nvmeSupport;
        private String price;
        private Integer primaryEniQueueNumber;
        private Integer secondaryEniQueueNumber;
        private Integer totalEniQueueQuantity;
        public Builder() {}
        public Builder(GetInstanceTypesInstanceType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.burstableInstance = defaults.burstableInstance;
    	      this.cpuCoreCount = defaults.cpuCoreCount;
    	      this.eniAmount = defaults.eniAmount;
    	      this.eniIpv6AddressQuantity = defaults.eniIpv6AddressQuantity;
    	      this.eniPrivateIpAddressQuantity = defaults.eniPrivateIpAddressQuantity;
    	      this.eniQuantity = defaults.eniQuantity;
    	      this.family = defaults.family;
    	      this.gpu = defaults.gpu;
    	      this.id = defaults.id;
    	      this.localStorage = defaults.localStorage;
    	      this.maximumQueueNumberPerEni = defaults.maximumQueueNumberPerEni;
    	      this.memorySize = defaults.memorySize;
    	      this.nvmeSupport = defaults.nvmeSupport;
    	      this.price = defaults.price;
    	      this.primaryEniQueueNumber = defaults.primaryEniQueueNumber;
    	      this.secondaryEniQueueNumber = defaults.secondaryEniQueueNumber;
    	      this.totalEniQueueQuantity = defaults.totalEniQueueQuantity;
        }

        @CustomType.Setter
        public Builder availabilityZones(List<String> availabilityZones) {
            if (availabilityZones == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "availabilityZones");
            }
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        @CustomType.Setter
        public Builder burstableInstance(GetInstanceTypesInstanceTypeBurstableInstance burstableInstance) {
            if (burstableInstance == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "burstableInstance");
            }
            this.burstableInstance = burstableInstance;
            return this;
        }
        @CustomType.Setter
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            if (cpuCoreCount == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "cpuCoreCount");
            }
            this.cpuCoreCount = cpuCoreCount;
            return this;
        }
        @CustomType.Setter
        public Builder eniAmount(Integer eniAmount) {
            if (eniAmount == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "eniAmount");
            }
            this.eniAmount = eniAmount;
            return this;
        }
        @CustomType.Setter
        public Builder eniIpv6AddressQuantity(Integer eniIpv6AddressQuantity) {
            if (eniIpv6AddressQuantity == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "eniIpv6AddressQuantity");
            }
            this.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
            return this;
        }
        @CustomType.Setter
        public Builder eniPrivateIpAddressQuantity(Integer eniPrivateIpAddressQuantity) {
            if (eniPrivateIpAddressQuantity == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "eniPrivateIpAddressQuantity");
            }
            this.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            return this;
        }
        @CustomType.Setter
        public Builder eniQuantity(Integer eniQuantity) {
            if (eniQuantity == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "eniQuantity");
            }
            this.eniQuantity = eniQuantity;
            return this;
        }
        @CustomType.Setter
        public Builder family(String family) {
            if (family == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "family");
            }
            this.family = family;
            return this;
        }
        @CustomType.Setter
        public Builder gpu(GetInstanceTypesInstanceTypeGpu gpu) {
            if (gpu == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "gpu");
            }
            this.gpu = gpu;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder localStorage(GetInstanceTypesInstanceTypeLocalStorage localStorage) {
            if (localStorage == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "localStorage");
            }
            this.localStorage = localStorage;
            return this;
        }
        @CustomType.Setter
        public Builder maximumQueueNumberPerEni(Integer maximumQueueNumberPerEni) {
            if (maximumQueueNumberPerEni == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "maximumQueueNumberPerEni");
            }
            this.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
            return this;
        }
        @CustomType.Setter
        public Builder memorySize(Double memorySize) {
            if (memorySize == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "memorySize");
            }
            this.memorySize = memorySize;
            return this;
        }
        @CustomType.Setter
        public Builder nvmeSupport(String nvmeSupport) {
            if (nvmeSupport == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "nvmeSupport");
            }
            this.nvmeSupport = nvmeSupport;
            return this;
        }
        @CustomType.Setter
        public Builder price(String price) {
            if (price == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "price");
            }
            this.price = price;
            return this;
        }
        @CustomType.Setter
        public Builder primaryEniQueueNumber(Integer primaryEniQueueNumber) {
            if (primaryEniQueueNumber == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "primaryEniQueueNumber");
            }
            this.primaryEniQueueNumber = primaryEniQueueNumber;
            return this;
        }
        @CustomType.Setter
        public Builder secondaryEniQueueNumber(Integer secondaryEniQueueNumber) {
            if (secondaryEniQueueNumber == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "secondaryEniQueueNumber");
            }
            this.secondaryEniQueueNumber = secondaryEniQueueNumber;
            return this;
        }
        @CustomType.Setter
        public Builder totalEniQueueQuantity(Integer totalEniQueueQuantity) {
            if (totalEniQueueQuantity == null) {
              throw new MissingRequiredPropertyException("GetInstanceTypesInstanceType", "totalEniQueueQuantity");
            }
            this.totalEniQueueQuantity = totalEniQueueQuantity;
            return this;
        }
        public GetInstanceTypesInstanceType build() {
            final var _resultValue = new GetInstanceTypesInstanceType();
            _resultValue.availabilityZones = availabilityZones;
            _resultValue.burstableInstance = burstableInstance;
            _resultValue.cpuCoreCount = cpuCoreCount;
            _resultValue.eniAmount = eniAmount;
            _resultValue.eniIpv6AddressQuantity = eniIpv6AddressQuantity;
            _resultValue.eniPrivateIpAddressQuantity = eniPrivateIpAddressQuantity;
            _resultValue.eniQuantity = eniQuantity;
            _resultValue.family = family;
            _resultValue.gpu = gpu;
            _resultValue.id = id;
            _resultValue.localStorage = localStorage;
            _resultValue.maximumQueueNumberPerEni = maximumQueueNumberPerEni;
            _resultValue.memorySize = memorySize;
            _resultValue.nvmeSupport = nvmeSupport;
            _resultValue.price = price;
            _resultValue.primaryEniQueueNumber = primaryEniQueueNumber;
            _resultValue.secondaryEniQueueNumber = secondaryEniQueueNumber;
            _resultValue.totalEniQueueQuantity = totalEniQueueQuantity;
            return _resultValue;
        }
    }
}
