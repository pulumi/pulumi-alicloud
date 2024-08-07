// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gpdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingDataServiceState extends com.pulumi.resources.ResourceArgs {

    public static final StreamingDataServiceState Empty = new StreamingDataServiceState();

    /**
     * Create time
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return Create time
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The ID of the associated instance.
     * 
     */
    @Import(name="dbInstanceId")
    private @Nullable Output<String> dbInstanceId;

    /**
     * @return The ID of the associated instance.
     * 
     */
    public Optional<Output<String>> dbInstanceId() {
        return Optional.ofNullable(this.dbInstanceId);
    }

    /**
     * The creation time of the resource
     * 
     */
    @Import(name="serviceDescription")
    private @Nullable Output<String> serviceDescription;

    /**
     * @return The creation time of the resource
     * 
     */
    public Optional<Output<String>> serviceDescription() {
        return Optional.ofNullable(this.serviceDescription);
    }

    /**
     * Service ID
     * 
     */
    @Import(name="serviceId")
    private @Nullable Output<String> serviceId;

    /**
     * @return Service ID
     * 
     */
    public Optional<Output<String>> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }

    /**
     * Service Name
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return Service Name
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * Resource Specifications
     * 
     */
    @Import(name="serviceSpec")
    private @Nullable Output<String> serviceSpec;

    /**
     * @return Resource Specifications
     * 
     */
    public Optional<Output<String>> serviceSpec() {
        return Optional.ofNullable(this.serviceSpec);
    }

    /**
     * The status of the resource
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the resource
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private StreamingDataServiceState() {}

    private StreamingDataServiceState(StreamingDataServiceState $) {
        this.createTime = $.createTime;
        this.dbInstanceId = $.dbInstanceId;
        this.serviceDescription = $.serviceDescription;
        this.serviceId = $.serviceId;
        this.serviceName = $.serviceName;
        this.serviceSpec = $.serviceSpec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingDataServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingDataServiceState $;

        public Builder() {
            $ = new StreamingDataServiceState();
        }

        public Builder(StreamingDataServiceState defaults) {
            $ = new StreamingDataServiceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime Create time
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime Create time
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param dbInstanceId The ID of the associated instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(@Nullable Output<String> dbInstanceId) {
            $.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * @param dbInstanceId The ID of the associated instance.
         * 
         * @return builder
         * 
         */
        public Builder dbInstanceId(String dbInstanceId) {
            return dbInstanceId(Output.of(dbInstanceId));
        }

        /**
         * @param serviceDescription The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder serviceDescription(@Nullable Output<String> serviceDescription) {
            $.serviceDescription = serviceDescription;
            return this;
        }

        /**
         * @param serviceDescription The creation time of the resource
         * 
         * @return builder
         * 
         */
        public Builder serviceDescription(String serviceDescription) {
            return serviceDescription(Output.of(serviceDescription));
        }

        /**
         * @param serviceId Service ID
         * 
         * @return builder
         * 
         */
        public Builder serviceId(@Nullable Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId Service ID
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        /**
         * @param serviceName Service Name
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName Service Name
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param serviceSpec Resource Specifications
         * 
         * @return builder
         * 
         */
        public Builder serviceSpec(@Nullable Output<String> serviceSpec) {
            $.serviceSpec = serviceSpec;
            return this;
        }

        /**
         * @param serviceSpec Resource Specifications
         * 
         * @return builder
         * 
         */
        public Builder serviceSpec(String serviceSpec) {
            return serviceSpec(Output.of(serviceSpec));
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the resource
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public StreamingDataServiceState build() {
            return $;
        }
    }

}
