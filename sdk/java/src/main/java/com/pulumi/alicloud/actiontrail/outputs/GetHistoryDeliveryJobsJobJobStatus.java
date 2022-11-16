// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHistoryDeliveryJobsJobJobStatus {
    /**
     * @return The region of the delivery job.
     * 
     */
    private final String region;
    /**
     * @return The status of the task. Valid values: `0`, `1`, `2`, `3`. `0`: The task is initializing. `1`: The task is delivering historical events. `2`: The delivery of historical events is complete. `3`: The task fails.
     * 
     */
    private final Integer status;

    @CustomType.Constructor
    private GetHistoryDeliveryJobsJobJobStatus(
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("status") Integer status) {
        this.region = region;
        this.status = status;
    }

    /**
     * @return The region of the delivery job.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return The status of the task. Valid values: `0`, `1`, `2`, `3`. `0`: The task is initializing. `1`: The task is delivering historical events. `2`: The delivery of historical events is complete. `3`: The task fails.
     * 
     */
    public Integer status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHistoryDeliveryJobsJobJobStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String region;
        private Integer status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHistoryDeliveryJobsJobJobStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
    	      this.status = defaults.status;
        }

        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder status(Integer status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetHistoryDeliveryJobsJobJobStatus build() {
            return new GetHistoryDeliveryJobsJobJobStatus(region, status);
        }
    }
}