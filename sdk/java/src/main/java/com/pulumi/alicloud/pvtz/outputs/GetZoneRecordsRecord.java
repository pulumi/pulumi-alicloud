// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.pvtz.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetZoneRecordsRecord {
    /**
     * @return ID of the Private Zone Record.
     * 
     */
    private String id;
    /**
     * @return Priority of the Private Zone Record.
     * 
     */
    private Integer priority;
    /**
     * @return RecordId of the Private Zone Record.
     * 
     */
    private String recordId;
    /**
     * @return Remark of the Private Zone Record.
     * 
     */
    private String remark;
    /**
     * @return Resource record of the Private Zone Record.
     * 
     */
    private String resourceRecord;
    /**
     * @return Rr of the Private Zone Record.
     * 
     */
    private String rr;
    /**
     * @return Resolve record status. Value:
     * - ENABLE: enable resolution.
     * - DISABLE: pause parsing.
     * 
     */
    private String status;
    /**
     * @return Ttl of the Private Zone Record.
     * 
     */
    private Integer ttl;
    /**
     * @return Type of the Private Zone Record.
     * 
     */
    private String type;
    /**
     * @return Value of the Private Zone Record.
     * 
     */
    private String value;

    private GetZoneRecordsRecord() {}
    /**
     * @return ID of the Private Zone Record.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Priority of the Private Zone Record.
     * 
     */
    public Integer priority() {
        return this.priority;
    }
    /**
     * @return RecordId of the Private Zone Record.
     * 
     */
    public String recordId() {
        return this.recordId;
    }
    /**
     * @return Remark of the Private Zone Record.
     * 
     */
    public String remark() {
        return this.remark;
    }
    /**
     * @return Resource record of the Private Zone Record.
     * 
     */
    public String resourceRecord() {
        return this.resourceRecord;
    }
    /**
     * @return Rr of the Private Zone Record.
     * 
     */
    public String rr() {
        return this.rr;
    }
    /**
     * @return Resolve record status. Value:
     * - ENABLE: enable resolution.
     * - DISABLE: pause parsing.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Ttl of the Private Zone Record.
     * 
     */
    public Integer ttl() {
        return this.ttl;
    }
    /**
     * @return Type of the Private Zone Record.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Value of the Private Zone Record.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetZoneRecordsRecord defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private Integer priority;
        private String recordId;
        private String remark;
        private String resourceRecord;
        private String rr;
        private String status;
        private Integer ttl;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetZoneRecordsRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.priority = defaults.priority;
    	      this.recordId = defaults.recordId;
    	      this.remark = defaults.remark;
    	      this.resourceRecord = defaults.resourceRecord;
    	      this.rr = defaults.rr;
    	      this.status = defaults.status;
    	      this.ttl = defaults.ttl;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder priority(Integer priority) {
            if (priority == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "priority");
            }
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder recordId(String recordId) {
            if (recordId == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "recordId");
            }
            this.recordId = recordId;
            return this;
        }
        @CustomType.Setter
        public Builder remark(String remark) {
            if (remark == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "remark");
            }
            this.remark = remark;
            return this;
        }
        @CustomType.Setter
        public Builder resourceRecord(String resourceRecord) {
            if (resourceRecord == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "resourceRecord");
            }
            this.resourceRecord = resourceRecord;
            return this;
        }
        @CustomType.Setter
        public Builder rr(String rr) {
            if (rr == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "rr");
            }
            this.rr = rr;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder ttl(Integer ttl) {
            if (ttl == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "ttl");
            }
            this.ttl = ttl;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "type");
            }
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            if (value == null) {
              throw new MissingRequiredPropertyException("GetZoneRecordsRecord", "value");
            }
            this.value = value;
            return this;
        }
        public GetZoneRecordsRecord build() {
            final var _resultValue = new GetZoneRecordsRecord();
            _resultValue.id = id;
            _resultValue.priority = priority;
            _resultValue.recordId = recordId;
            _resultValue.remark = remark;
            _resultValue.resourceRecord = resourceRecord;
            _resultValue.rr = rr;
            _resultValue.status = status;
            _resultValue.ttl = ttl;
            _resultValue.type = type;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
