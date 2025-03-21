// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.fc;

import com.pulumi.alicloud.fc.inputs.V3FunctionCodeArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionCustomContainerConfigArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionCustomDnsArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionCustomRuntimeConfigArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionGpuConfigArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionInstanceLifecycleConfigArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionLogConfigArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionNasConfigArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionOssMountConfigArgs;
import com.pulumi.alicloud.fc.inputs.V3FunctionVpcConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class V3FunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final V3FunctionArgs Empty = new V3FunctionArgs();

    /**
     * Function code ZIP package. code and customContainerConfig. See `code` below.
     * 
     */
    @Import(name="code")
    private @Nullable Output<V3FunctionCodeArgs> code;

    /**
     * @return Function code ZIP package. code and customContainerConfig. See `code` below.
     * 
     */
    public Optional<Output<V3FunctionCodeArgs>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * The CPU specification of the function. The unit is vCPU, which is a multiple of the 0.05 vCPU.
     * 
     */
    @Import(name="cpu")
    private @Nullable Output<Double> cpu;

    /**
     * @return The CPU specification of the function. The unit is vCPU, which is a multiple of the 0.05 vCPU.
     * 
     */
    public Optional<Output<Double>> cpu() {
        return Optional.ofNullable(this.cpu);
    }

    /**
     * The configuration of the custom container runtime. After the configuration is successful, the function can use the custom container image to execute the function. code and customContainerConfig. See `custom_container_config` below.
     * 
     */
    @Import(name="customContainerConfig")
    private @Nullable Output<V3FunctionCustomContainerConfigArgs> customContainerConfig;

    /**
     * @return The configuration of the custom container runtime. After the configuration is successful, the function can use the custom container image to execute the function. code and customContainerConfig. See `custom_container_config` below.
     * 
     */
    public Optional<Output<V3FunctionCustomContainerConfigArgs>> customContainerConfig() {
        return Optional.ofNullable(this.customContainerConfig);
    }

    /**
     * Function custom DNS configuration See `custom_dns` below.
     * 
     */
    @Import(name="customDns")
    private @Nullable Output<V3FunctionCustomDnsArgs> customDns;

    /**
     * @return Function custom DNS configuration See `custom_dns` below.
     * 
     */
    public Optional<Output<V3FunctionCustomDnsArgs>> customDns() {
        return Optional.ofNullable(this.customDns);
    }

    /**
     * Customize the runtime configuration. See `custom_runtime_config` below.
     * 
     */
    @Import(name="customRuntimeConfig")
    private @Nullable Output<V3FunctionCustomRuntimeConfigArgs> customRuntimeConfig;

    /**
     * @return Customize the runtime configuration. See `custom_runtime_config` below.
     * 
     */
    public Optional<Output<V3FunctionCustomRuntimeConfigArgs>> customRuntimeConfig() {
        return Optional.ofNullable(this.customRuntimeConfig);
    }

    /**
     * The description of the function. The function compute system does not use this attribute value, but we recommend that you set a concise and clear description for the function.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the function. The function compute system does not use this attribute value, but we recommend that you set a concise and clear description for the function.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The disk specification of the function, in MB. The optional value is 512 MB or 10240MB.
     * 
     */
    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    /**
     * @return The disk specification of the function, in MB. The optional value is 512 MB or 10240MB.
     * 
     */
    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    /**
     * The environment variable set for the function, you can get the value of the environment variable in the function.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,String>> environmentVariables;

    /**
     * @return The environment variable set for the function, you can get the value of the environment variable in the function.
     * 
     */
    public Optional<Output<Map<String,String>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * The function name. Consists of uppercase and lowercase letters, digits (0 to 9), underscores (_), and dashes (-). It must begin with an English letter (a ~ z), (A ~ Z), or an underscore (_). Case sensitive. The length is 1~128 characters.
     * 
     */
    @Import(name="functionName")
    private @Nullable Output<String> functionName;

    /**
     * @return The function name. Consists of uppercase and lowercase letters, digits (0 to 9), underscores (_), and dashes (-). It must begin with an English letter (a ~ z), (A ~ Z), or an underscore (_). Case sensitive. The length is 1~128 characters.
     * 
     */
    public Optional<Output<String>> functionName() {
        return Optional.ofNullable(this.functionName);
    }

    /**
     * Function GPU configuration. See `gpu_config` below.
     * 
     */
    @Import(name="gpuConfig")
    private @Nullable Output<V3FunctionGpuConfigArgs> gpuConfig;

    /**
     * @return Function GPU configuration. See `gpu_config` below.
     * 
     */
    public Optional<Output<V3FunctionGpuConfigArgs>> gpuConfig() {
        return Optional.ofNullable(this.gpuConfig);
    }

    /**
     * Function Handler: the call entry for the function compute system to run your function.
     * 
     */
    @Import(name="handler", required=true)
    private Output<String> handler;

    /**
     * @return Function Handler: the call entry for the function compute system to run your function.
     * 
     */
    public Output<String> handler() {
        return this.handler;
    }

    /**
     * Maximum instance concurrency.
     * 
     */
    @Import(name="instanceConcurrency")
    private @Nullable Output<Integer> instanceConcurrency;

    /**
     * @return Maximum instance concurrency.
     * 
     */
    public Optional<Output<Integer>> instanceConcurrency() {
        return Optional.ofNullable(this.instanceConcurrency);
    }

    /**
     * Instance lifecycle callback method configuration. See `instance_lifecycle_config` below.
     * 
     */
    @Import(name="instanceLifecycleConfig")
    private @Nullable Output<V3FunctionInstanceLifecycleConfigArgs> instanceLifecycleConfig;

    /**
     * @return Instance lifecycle callback method configuration. See `instance_lifecycle_config` below.
     * 
     */
    public Optional<Output<V3FunctionInstanceLifecycleConfigArgs>> instanceLifecycleConfig() {
        return Optional.ofNullable(this.instanceLifecycleConfig);
    }

    /**
     * Allow function to access public network
     * 
     */
    @Import(name="internetAccess")
    private @Nullable Output<Boolean> internetAccess;

    /**
     * @return Allow function to access public network
     * 
     */
    public Optional<Output<Boolean>> internetAccess() {
        return Optional.ofNullable(this.internetAccess);
    }

    /**
     * The list of layers.
     * 
     */
    @Import(name="layers")
    private @Nullable Output<List<String>> layers;

    /**
     * @return The list of layers.
     * 
     */
    public Optional<Output<List<String>>> layers() {
        return Optional.ofNullable(this.layers);
    }

    /**
     * The logs generated by the function are written to the configured Logstore. See `log_config` below.
     * 
     */
    @Import(name="logConfig")
    private @Nullable Output<V3FunctionLogConfigArgs> logConfig;

    /**
     * @return The logs generated by the function are written to the configured Logstore. See `log_config` below.
     * 
     */
    public Optional<Output<V3FunctionLogConfigArgs>> logConfig() {
        return Optional.ofNullable(this.logConfig);
    }

    /**
     * The memory specification of the function. The unit is MB. The memory size is a multiple of 64MB. The minimum value is 128MB and the maximum value is 32GB. At the same time, the ratio of cpu to memorySize (calculated by GB) should be between 1:1 and 1:4.
     * 
     */
    @Import(name="memorySize")
    private @Nullable Output<Integer> memorySize;

    /**
     * @return The memory specification of the function. The unit is MB. The memory size is a multiple of 64MB. The minimum value is 128MB and the maximum value is 32GB. At the same time, the ratio of cpu to memorySize (calculated by GB) should be between 1:1 and 1:4.
     * 
     */
    public Optional<Output<Integer>> memorySize() {
        return Optional.ofNullable(this.memorySize);
    }

    /**
     * NAS configuration. After this parameter is configured, the function can access the specified NAS resource. See `nas_config` below.
     * 
     */
    @Import(name="nasConfig")
    private @Nullable Output<V3FunctionNasConfigArgs> nasConfig;

    /**
     * @return NAS configuration. After this parameter is configured, the function can access the specified NAS resource. See `nas_config` below.
     * 
     */
    public Optional<Output<V3FunctionNasConfigArgs>> nasConfig() {
        return Optional.ofNullable(this.nasConfig);
    }

    /**
     * OSS mount configuration See `oss_mount_config` below.
     * 
     */
    @Import(name="ossMountConfig")
    private @Nullable Output<V3FunctionOssMountConfigArgs> ossMountConfig;

    /**
     * @return OSS mount configuration See `oss_mount_config` below.
     * 
     */
    public Optional<Output<V3FunctionOssMountConfigArgs>> ossMountConfig() {
        return Optional.ofNullable(this.ossMountConfig);
    }

    /**
     * The user is authorized to the RAM role of function compute. After the configuration, function compute will assume this role to generate temporary access credentials. In the function, you can use the temporary access credentials of the role to access the specified Alibaba cloud service, such as OSS and OTS
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The user is authorized to the RAM role of function compute. After the configuration, function compute will assume this role to generate temporary access credentials. In the function, you can use the temporary access credentials of the role to access the specified Alibaba cloud service, such as OSS and OTS
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Function runtime type
     * 
     */
    @Import(name="runtime", required=true)
    private Output<String> runtime;

    /**
     * @return Function runtime type
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }

    /**
     * The tag of the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tag of the resource
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The maximum running time of the function, in seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return The maximum running time of the function, in seconds.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * VPC configuration. After this parameter is configured, the function can access the specified VPC resources. See `vpc_config` below.
     * 
     */
    @Import(name="vpcConfig")
    private @Nullable Output<V3FunctionVpcConfigArgs> vpcConfig;

    /**
     * @return VPC configuration. After this parameter is configured, the function can access the specified VPC resources. See `vpc_config` below.
     * 
     */
    public Optional<Output<V3FunctionVpcConfigArgs>> vpcConfig() {
        return Optional.ofNullable(this.vpcConfig);
    }

    private V3FunctionArgs() {}

    private V3FunctionArgs(V3FunctionArgs $) {
        this.code = $.code;
        this.cpu = $.cpu;
        this.customContainerConfig = $.customContainerConfig;
        this.customDns = $.customDns;
        this.customRuntimeConfig = $.customRuntimeConfig;
        this.description = $.description;
        this.diskSize = $.diskSize;
        this.environmentVariables = $.environmentVariables;
        this.functionName = $.functionName;
        this.gpuConfig = $.gpuConfig;
        this.handler = $.handler;
        this.instanceConcurrency = $.instanceConcurrency;
        this.instanceLifecycleConfig = $.instanceLifecycleConfig;
        this.internetAccess = $.internetAccess;
        this.layers = $.layers;
        this.logConfig = $.logConfig;
        this.memorySize = $.memorySize;
        this.nasConfig = $.nasConfig;
        this.ossMountConfig = $.ossMountConfig;
        this.role = $.role;
        this.runtime = $.runtime;
        this.tags = $.tags;
        this.timeout = $.timeout;
        this.vpcConfig = $.vpcConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(V3FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private V3FunctionArgs $;

        public Builder() {
            $ = new V3FunctionArgs();
        }

        public Builder(V3FunctionArgs defaults) {
            $ = new V3FunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param code Function code ZIP package. code and customContainerConfig. See `code` below.
         * 
         * @return builder
         * 
         */
        public Builder code(@Nullable Output<V3FunctionCodeArgs> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Function code ZIP package. code and customContainerConfig. See `code` below.
         * 
         * @return builder
         * 
         */
        public Builder code(V3FunctionCodeArgs code) {
            return code(Output.of(code));
        }

        /**
         * @param cpu The CPU specification of the function. The unit is vCPU, which is a multiple of the 0.05 vCPU.
         * 
         * @return builder
         * 
         */
        public Builder cpu(@Nullable Output<Double> cpu) {
            $.cpu = cpu;
            return this;
        }

        /**
         * @param cpu The CPU specification of the function. The unit is vCPU, which is a multiple of the 0.05 vCPU.
         * 
         * @return builder
         * 
         */
        public Builder cpu(Double cpu) {
            return cpu(Output.of(cpu));
        }

        /**
         * @param customContainerConfig The configuration of the custom container runtime. After the configuration is successful, the function can use the custom container image to execute the function. code and customContainerConfig. See `custom_container_config` below.
         * 
         * @return builder
         * 
         */
        public Builder customContainerConfig(@Nullable Output<V3FunctionCustomContainerConfigArgs> customContainerConfig) {
            $.customContainerConfig = customContainerConfig;
            return this;
        }

        /**
         * @param customContainerConfig The configuration of the custom container runtime. After the configuration is successful, the function can use the custom container image to execute the function. code and customContainerConfig. See `custom_container_config` below.
         * 
         * @return builder
         * 
         */
        public Builder customContainerConfig(V3FunctionCustomContainerConfigArgs customContainerConfig) {
            return customContainerConfig(Output.of(customContainerConfig));
        }

        /**
         * @param customDns Function custom DNS configuration See `custom_dns` below.
         * 
         * @return builder
         * 
         */
        public Builder customDns(@Nullable Output<V3FunctionCustomDnsArgs> customDns) {
            $.customDns = customDns;
            return this;
        }

        /**
         * @param customDns Function custom DNS configuration See `custom_dns` below.
         * 
         * @return builder
         * 
         */
        public Builder customDns(V3FunctionCustomDnsArgs customDns) {
            return customDns(Output.of(customDns));
        }

        /**
         * @param customRuntimeConfig Customize the runtime configuration. See `custom_runtime_config` below.
         * 
         * @return builder
         * 
         */
        public Builder customRuntimeConfig(@Nullable Output<V3FunctionCustomRuntimeConfigArgs> customRuntimeConfig) {
            $.customRuntimeConfig = customRuntimeConfig;
            return this;
        }

        /**
         * @param customRuntimeConfig Customize the runtime configuration. See `custom_runtime_config` below.
         * 
         * @return builder
         * 
         */
        public Builder customRuntimeConfig(V3FunctionCustomRuntimeConfigArgs customRuntimeConfig) {
            return customRuntimeConfig(Output.of(customRuntimeConfig));
        }

        /**
         * @param description The description of the function. The function compute system does not use this attribute value, but we recommend that you set a concise and clear description for the function.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the function. The function compute system does not use this attribute value, but we recommend that you set a concise and clear description for the function.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param diskSize The disk specification of the function, in MB. The optional value is 512 MB or 10240MB.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        /**
         * @param diskSize The disk specification of the function, in MB. The optional value is 512 MB or 10240MB.
         * 
         * @return builder
         * 
         */
        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        /**
         * @param environmentVariables The environment variable set for the function, you can get the value of the environment variable in the function.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables The environment variable set for the function, you can get the value of the environment variable in the function.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,String> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param functionName The function name. Consists of uppercase and lowercase letters, digits (0 to 9), underscores (_), and dashes (-). It must begin with an English letter (a ~ z), (A ~ Z), or an underscore (_). Case sensitive. The length is 1~128 characters.
         * 
         * @return builder
         * 
         */
        public Builder functionName(@Nullable Output<String> functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param functionName The function name. Consists of uppercase and lowercase letters, digits (0 to 9), underscores (_), and dashes (-). It must begin with an English letter (a ~ z), (A ~ Z), or an underscore (_). Case sensitive. The length is 1~128 characters.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            return functionName(Output.of(functionName));
        }

        /**
         * @param gpuConfig Function GPU configuration. See `gpu_config` below.
         * 
         * @return builder
         * 
         */
        public Builder gpuConfig(@Nullable Output<V3FunctionGpuConfigArgs> gpuConfig) {
            $.gpuConfig = gpuConfig;
            return this;
        }

        /**
         * @param gpuConfig Function GPU configuration. See `gpu_config` below.
         * 
         * @return builder
         * 
         */
        public Builder gpuConfig(V3FunctionGpuConfigArgs gpuConfig) {
            return gpuConfig(Output.of(gpuConfig));
        }

        /**
         * @param handler Function Handler: the call entry for the function compute system to run your function.
         * 
         * @return builder
         * 
         */
        public Builder handler(Output<String> handler) {
            $.handler = handler;
            return this;
        }

        /**
         * @param handler Function Handler: the call entry for the function compute system to run your function.
         * 
         * @return builder
         * 
         */
        public Builder handler(String handler) {
            return handler(Output.of(handler));
        }

        /**
         * @param instanceConcurrency Maximum instance concurrency.
         * 
         * @return builder
         * 
         */
        public Builder instanceConcurrency(@Nullable Output<Integer> instanceConcurrency) {
            $.instanceConcurrency = instanceConcurrency;
            return this;
        }

        /**
         * @param instanceConcurrency Maximum instance concurrency.
         * 
         * @return builder
         * 
         */
        public Builder instanceConcurrency(Integer instanceConcurrency) {
            return instanceConcurrency(Output.of(instanceConcurrency));
        }

        /**
         * @param instanceLifecycleConfig Instance lifecycle callback method configuration. See `instance_lifecycle_config` below.
         * 
         * @return builder
         * 
         */
        public Builder instanceLifecycleConfig(@Nullable Output<V3FunctionInstanceLifecycleConfigArgs> instanceLifecycleConfig) {
            $.instanceLifecycleConfig = instanceLifecycleConfig;
            return this;
        }

        /**
         * @param instanceLifecycleConfig Instance lifecycle callback method configuration. See `instance_lifecycle_config` below.
         * 
         * @return builder
         * 
         */
        public Builder instanceLifecycleConfig(V3FunctionInstanceLifecycleConfigArgs instanceLifecycleConfig) {
            return instanceLifecycleConfig(Output.of(instanceLifecycleConfig));
        }

        /**
         * @param internetAccess Allow function to access public network
         * 
         * @return builder
         * 
         */
        public Builder internetAccess(@Nullable Output<Boolean> internetAccess) {
            $.internetAccess = internetAccess;
            return this;
        }

        /**
         * @param internetAccess Allow function to access public network
         * 
         * @return builder
         * 
         */
        public Builder internetAccess(Boolean internetAccess) {
            return internetAccess(Output.of(internetAccess));
        }

        /**
         * @param layers The list of layers.
         * 
         * @return builder
         * 
         */
        public Builder layers(@Nullable Output<List<String>> layers) {
            $.layers = layers;
            return this;
        }

        /**
         * @param layers The list of layers.
         * 
         * @return builder
         * 
         */
        public Builder layers(List<String> layers) {
            return layers(Output.of(layers));
        }

        /**
         * @param layers The list of layers.
         * 
         * @return builder
         * 
         */
        public Builder layers(String... layers) {
            return layers(List.of(layers));
        }

        /**
         * @param logConfig The logs generated by the function are written to the configured Logstore. See `log_config` below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(@Nullable Output<V3FunctionLogConfigArgs> logConfig) {
            $.logConfig = logConfig;
            return this;
        }

        /**
         * @param logConfig The logs generated by the function are written to the configured Logstore. See `log_config` below.
         * 
         * @return builder
         * 
         */
        public Builder logConfig(V3FunctionLogConfigArgs logConfig) {
            return logConfig(Output.of(logConfig));
        }

        /**
         * @param memorySize The memory specification of the function. The unit is MB. The memory size is a multiple of 64MB. The minimum value is 128MB and the maximum value is 32GB. At the same time, the ratio of cpu to memorySize (calculated by GB) should be between 1:1 and 1:4.
         * 
         * @return builder
         * 
         */
        public Builder memorySize(@Nullable Output<Integer> memorySize) {
            $.memorySize = memorySize;
            return this;
        }

        /**
         * @param memorySize The memory specification of the function. The unit is MB. The memory size is a multiple of 64MB. The minimum value is 128MB and the maximum value is 32GB. At the same time, the ratio of cpu to memorySize (calculated by GB) should be between 1:1 and 1:4.
         * 
         * @return builder
         * 
         */
        public Builder memorySize(Integer memorySize) {
            return memorySize(Output.of(memorySize));
        }

        /**
         * @param nasConfig NAS configuration. After this parameter is configured, the function can access the specified NAS resource. See `nas_config` below.
         * 
         * @return builder
         * 
         */
        public Builder nasConfig(@Nullable Output<V3FunctionNasConfigArgs> nasConfig) {
            $.nasConfig = nasConfig;
            return this;
        }

        /**
         * @param nasConfig NAS configuration. After this parameter is configured, the function can access the specified NAS resource. See `nas_config` below.
         * 
         * @return builder
         * 
         */
        public Builder nasConfig(V3FunctionNasConfigArgs nasConfig) {
            return nasConfig(Output.of(nasConfig));
        }

        /**
         * @param ossMountConfig OSS mount configuration See `oss_mount_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ossMountConfig(@Nullable Output<V3FunctionOssMountConfigArgs> ossMountConfig) {
            $.ossMountConfig = ossMountConfig;
            return this;
        }

        /**
         * @param ossMountConfig OSS mount configuration See `oss_mount_config` below.
         * 
         * @return builder
         * 
         */
        public Builder ossMountConfig(V3FunctionOssMountConfigArgs ossMountConfig) {
            return ossMountConfig(Output.of(ossMountConfig));
        }

        /**
         * @param role The user is authorized to the RAM role of function compute. After the configuration, function compute will assume this role to generate temporary access credentials. In the function, you can use the temporary access credentials of the role to access the specified Alibaba cloud service, such as OSS and OTS
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The user is authorized to the RAM role of function compute. After the configuration, function compute will assume this role to generate temporary access credentials. In the function, you can use the temporary access credentials of the role to access the specified Alibaba cloud service, such as OSS and OTS
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param runtime Function runtime type
         * 
         * @return builder
         * 
         */
        public Builder runtime(Output<String> runtime) {
            $.runtime = runtime;
            return this;
        }

        /**
         * @param runtime Function runtime type
         * 
         * @return builder
         * 
         */
        public Builder runtime(String runtime) {
            return runtime(Output.of(runtime));
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tag of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param timeout The maximum running time of the function, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout The maximum running time of the function, in seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param vpcConfig VPC configuration. After this parameter is configured, the function can access the specified VPC resources. See `vpc_config` below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfig(@Nullable Output<V3FunctionVpcConfigArgs> vpcConfig) {
            $.vpcConfig = vpcConfig;
            return this;
        }

        /**
         * @param vpcConfig VPC configuration. After this parameter is configured, the function can access the specified VPC resources. See `vpc_config` below.
         * 
         * @return builder
         * 
         */
        public Builder vpcConfig(V3FunctionVpcConfigArgs vpcConfig) {
            return vpcConfig(Output.of(vpcConfig));
        }

        public V3FunctionArgs build() {
            if ($.handler == null) {
                throw new MissingRequiredPropertyException("V3FunctionArgs", "handler");
            }
            if ($.runtime == null) {
                throw new MissingRequiredPropertyException("V3FunctionArgs", "runtime");
            }
            return $;
        }
    }

}
