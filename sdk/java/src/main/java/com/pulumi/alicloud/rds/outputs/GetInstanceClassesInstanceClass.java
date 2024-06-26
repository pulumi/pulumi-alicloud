// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.alicloud.rds.outputs.GetInstanceClassesInstanceClassStorageRange;
import com.pulumi.alicloud.rds.outputs.GetInstanceClassesInstanceClassZoneId;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetInstanceClassesInstanceClass {
    /**
     * @return DB Instance available class.
     * 
     */
    private String instanceClass;
    private String price;
    /**
     * @return DB Instance available storage range.
     * 
     */
    private GetInstanceClassesInstanceClassStorageRange storageRange;
    /**
     * @return A list of Zone to launch the DB instance.
     * 
     */
    private List<GetInstanceClassesInstanceClassZoneId> zoneIds;

    private GetInstanceClassesInstanceClass() {}
    /**
     * @return DB Instance available class.
     * 
     */
    public String instanceClass() {
        return this.instanceClass;
    }
    public String price() {
        return this.price;
    }
    /**
     * @return DB Instance available storage range.
     * 
     */
    public GetInstanceClassesInstanceClassStorageRange storageRange() {
        return this.storageRange;
    }
    /**
     * @return A list of Zone to launch the DB instance.
     * 
     */
    public List<GetInstanceClassesInstanceClassZoneId> zoneIds() {
        return this.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceClassesInstanceClass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String instanceClass;
        private String price;
        private GetInstanceClassesInstanceClassStorageRange storageRange;
        private List<GetInstanceClassesInstanceClassZoneId> zoneIds;
        public Builder() {}
        public Builder(GetInstanceClassesInstanceClass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceClass = defaults.instanceClass;
    	      this.price = defaults.price;
    	      this.storageRange = defaults.storageRange;
    	      this.zoneIds = defaults.zoneIds;
        }

        @CustomType.Setter
        public Builder instanceClass(String instanceClass) {
            if (instanceClass == null) {
              throw new MissingRequiredPropertyException("GetInstanceClassesInstanceClass", "instanceClass");
            }
            this.instanceClass = instanceClass;
            return this;
        }
        @CustomType.Setter
        public Builder price(String price) {
            if (price == null) {
              throw new MissingRequiredPropertyException("GetInstanceClassesInstanceClass", "price");
            }
            this.price = price;
            return this;
        }
        @CustomType.Setter
        public Builder storageRange(GetInstanceClassesInstanceClassStorageRange storageRange) {
            if (storageRange == null) {
              throw new MissingRequiredPropertyException("GetInstanceClassesInstanceClass", "storageRange");
            }
            this.storageRange = storageRange;
            return this;
        }
        @CustomType.Setter
        public Builder zoneIds(List<GetInstanceClassesInstanceClassZoneId> zoneIds) {
            if (zoneIds == null) {
              throw new MissingRequiredPropertyException("GetInstanceClassesInstanceClass", "zoneIds");
            }
            this.zoneIds = zoneIds;
            return this;
        }
        public Builder zoneIds(GetInstanceClassesInstanceClassZoneId... zoneIds) {
            return zoneIds(List.of(zoneIds));
        }
        public GetInstanceClassesInstanceClass build() {
            final var _resultValue = new GetInstanceClassesInstanceClass();
            _resultValue.instanceClass = instanceClass;
            _resultValue.price = price;
            _resultValue.storageRange = storageRange;
            _resultValue.zoneIds = zoneIds;
            return _resultValue;
        }
    }
}
