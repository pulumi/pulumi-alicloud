// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.rds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInstanceClassInfosInfo {
    /**
     * @return The code of the instance type.
     * 
     */
    private @Nullable String classCode;
    /**
     * @return The instance family of the instance.
     * 
     */
    private @Nullable String classGroup;
    /**
     * @return The number of cores that are supported by the instance type. Unit: cores.
     * 
     */
    private @Nullable String cpu;
    /**
     * @return The architecture of the instance type.
     * 
     */
    private @Nullable String instructionSetArch;
    /**
     * @return The maximum number of connections that are supported by the instance type. Unit: connections.
     * 
     */
    private @Nullable String maxConnections;
    /**
     * @return The maximum I/O bandwidth that is supported by the instance type. Unit: Mbit/s.
     * 
     */
    private @Nullable String maxIombps;
    /**
     * @return The maximum input/output operations per second (IOPS) that is supported by the instance type. Unit: operations per second.
     * 
     */
    private @Nullable String maxIops;
    /**
     * @return The memory capacity that is supported by the instance type. Unit: GB.
     * 
     */
    private @Nullable String memoryClass;
    /**
     * @return The fee that you must pay for the instance type. Unit: cent (USD).
     * 
     */
    private @Nullable String referencePrice;

    private GetInstanceClassInfosInfo() {}
    /**
     * @return The code of the instance type.
     * 
     */
    public Optional<String> classCode() {
        return Optional.ofNullable(this.classCode);
    }
    /**
     * @return The instance family of the instance.
     * 
     */
    public Optional<String> classGroup() {
        return Optional.ofNullable(this.classGroup);
    }
    /**
     * @return The number of cores that are supported by the instance type. Unit: cores.
     * 
     */
    public Optional<String> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * @return The architecture of the instance type.
     * 
     */
    public Optional<String> instructionSetArch() {
        return Optional.ofNullable(this.instructionSetArch);
    }
    /**
     * @return The maximum number of connections that are supported by the instance type. Unit: connections.
     * 
     */
    public Optional<String> maxConnections() {
        return Optional.ofNullable(this.maxConnections);
    }
    /**
     * @return The maximum I/O bandwidth that is supported by the instance type. Unit: Mbit/s.
     * 
     */
    public Optional<String> maxIombps() {
        return Optional.ofNullable(this.maxIombps);
    }
    /**
     * @return The maximum input/output operations per second (IOPS) that is supported by the instance type. Unit: operations per second.
     * 
     */
    public Optional<String> maxIops() {
        return Optional.ofNullable(this.maxIops);
    }
    /**
     * @return The memory capacity that is supported by the instance type. Unit: GB.
     * 
     */
    public Optional<String> memoryClass() {
        return Optional.ofNullable(this.memoryClass);
    }
    /**
     * @return The fee that you must pay for the instance type. Unit: cent (USD).
     * 
     */
    public Optional<String> referencePrice() {
        return Optional.ofNullable(this.referencePrice);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceClassInfosInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String classCode;
        private @Nullable String classGroup;
        private @Nullable String cpu;
        private @Nullable String instructionSetArch;
        private @Nullable String maxConnections;
        private @Nullable String maxIombps;
        private @Nullable String maxIops;
        private @Nullable String memoryClass;
        private @Nullable String referencePrice;
        public Builder() {}
        public Builder(GetInstanceClassInfosInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classCode = defaults.classCode;
    	      this.classGroup = defaults.classGroup;
    	      this.cpu = defaults.cpu;
    	      this.instructionSetArch = defaults.instructionSetArch;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxIombps = defaults.maxIombps;
    	      this.maxIops = defaults.maxIops;
    	      this.memoryClass = defaults.memoryClass;
    	      this.referencePrice = defaults.referencePrice;
        }

        @CustomType.Setter
        public Builder classCode(@Nullable String classCode) {
            this.classCode = classCode;
            return this;
        }
        @CustomType.Setter
        public Builder classGroup(@Nullable String classGroup) {
            this.classGroup = classGroup;
            return this;
        }
        @CustomType.Setter
        public Builder cpu(@Nullable String cpu) {
            this.cpu = cpu;
            return this;
        }
        @CustomType.Setter
        public Builder instructionSetArch(@Nullable String instructionSetArch) {
            this.instructionSetArch = instructionSetArch;
            return this;
        }
        @CustomType.Setter
        public Builder maxConnections(@Nullable String maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        @CustomType.Setter
        public Builder maxIombps(@Nullable String maxIombps) {
            this.maxIombps = maxIombps;
            return this;
        }
        @CustomType.Setter
        public Builder maxIops(@Nullable String maxIops) {
            this.maxIops = maxIops;
            return this;
        }
        @CustomType.Setter
        public Builder memoryClass(@Nullable String memoryClass) {
            this.memoryClass = memoryClass;
            return this;
        }
        @CustomType.Setter
        public Builder referencePrice(@Nullable String referencePrice) {
            this.referencePrice = referencePrice;
            return this;
        }
        public GetInstanceClassInfosInfo build() {
            final var o = new GetInstanceClassInfosInfo();
            o.classCode = classCode;
            o.classGroup = classGroup;
            o.cpu = cpu;
            o.instructionSetArch = instructionSetArch;
            o.maxConnections = maxConnections;
            o.maxIombps = maxIombps;
            o.maxIops = maxIops;
            o.memoryClass = memoryClass;
            o.referencePrice = referencePrice;
            return o;
        }
    }
}