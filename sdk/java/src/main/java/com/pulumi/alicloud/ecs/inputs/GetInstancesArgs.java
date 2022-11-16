// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancesArgs Empty = new GetInstancesArgs();

    /**
     * Availability zone where instances are located.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return Availability zone where instances are located.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * A list of ECS instance IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable Output<List<String>> ids;

    /**
     * @return A list of ECS instance IDs.
     * 
     */
    public Optional<Output<List<String>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The image ID of some ECS instance used.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The image ID of some ECS instance used.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * A regex string to filter results by instance name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable Output<String> nameRegex;

    /**
     * @return A regex string to filter results by instance name.
     * 
     */
    public Optional<Output<String>> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    @Import(name="pageNumber")
    private @Nullable Output<Integer> pageNumber;

    public Optional<Output<Integer>> pageNumber() {
        return Optional.ofNullable(this.pageNumber);
    }

    @Import(name="pageSize")
    private @Nullable Output<Integer> pageSize;

    public Optional<Output<Integer>> pageSize() {
        return Optional.ofNullable(this.pageSize);
    }

    /**
     * The RAM role name which the instance attaches.
     * 
     */
    @Import(name="ramRoleName")
    private @Nullable Output<String> ramRoleName;

    /**
     * @return The RAM role name which the instance attaches.
     * 
     */
    public Optional<Output<String>> ramRoleName() {
        return Optional.ofNullable(this.ramRoleName);
    }

    /**
     * The Id of resource group which the instance belongs.
     * 
     */
    @Import(name="resourceGroupId")
    private @Nullable Output<String> resourceGroupId;

    /**
     * @return The Id of resource group which the instance belongs.
     * 
     */
    public Optional<Output<String>> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }

    /**
     * Instance status. Valid values: &#34;Creating&#34;, &#34;Starting&#34;, &#34;Running&#34;, &#34;Stopping&#34; and &#34;Stopped&#34;. If undefined, all statuses are considered.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Instance status. Valid values: &#34;Creating&#34;, &#34;Starting&#34;, &#34;Running&#34;, &#34;Stopping&#34; and &#34;Stopped&#34;. If undefined, all statuses are considered.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * A map of tags assigned to the ECS instances. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ecs.EcsFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var taggedInstances = EcsFunctions.getInstances(GetInstancesArgs.builder()
     *             .tags(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A map of tags assigned to the ECS instances. It must be in the format:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ecs.EcsFunctions;
     * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var taggedInstances = EcsFunctions.getInstances(GetInstancesArgs.builder()
     *             .tags(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * ID of the VPC linked to the instances.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return ID of the VPC linked to the instances.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * ID of the VSwitch linked to the instances.
     * 
     */
    @Import(name="vswitchId")
    private @Nullable Output<String> vswitchId;

    /**
     * @return ID of the VSwitch linked to the instances.
     * 
     */
    public Optional<Output<String>> vswitchId() {
        return Optional.ofNullable(this.vswitchId);
    }

    private GetInstancesArgs() {}

    private GetInstancesArgs(GetInstancesArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.ids = $.ids;
        this.imageId = $.imageId;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.pageNumber = $.pageNumber;
        this.pageSize = $.pageSize;
        this.ramRoleName = $.ramRoleName;
        this.resourceGroupId = $.resourceGroupId;
        this.status = $.status;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancesArgs $;

        public Builder() {
            $ = new GetInstancesArgs();
        }

        public Builder(GetInstancesArgs defaults) {
            $ = new GetInstancesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZone Availability zone where instances are located.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone Availability zone where instances are located.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param ids A list of ECS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<List<String>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of ECS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(List<String> ids) {
            return ids(Output.of(ids));
        }

        /**
         * @param ids A list of ECS instance IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param imageId The image ID of some ECS instance used.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The image ID of some ECS instance used.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param nameRegex A regex string to filter results by instance name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable Output<String> nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by instance name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(String nameRegex) {
            return nameRegex(Output.of(nameRegex));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        public Builder pageNumber(@Nullable Output<Integer> pageNumber) {
            $.pageNumber = pageNumber;
            return this;
        }

        public Builder pageNumber(Integer pageNumber) {
            return pageNumber(Output.of(pageNumber));
        }

        public Builder pageSize(@Nullable Output<Integer> pageSize) {
            $.pageSize = pageSize;
            return this;
        }

        public Builder pageSize(Integer pageSize) {
            return pageSize(Output.of(pageSize));
        }

        /**
         * @param ramRoleName The RAM role name which the instance attaches.
         * 
         * @return builder
         * 
         */
        public Builder ramRoleName(@Nullable Output<String> ramRoleName) {
            $.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * @param ramRoleName The RAM role name which the instance attaches.
         * 
         * @return builder
         * 
         */
        public Builder ramRoleName(String ramRoleName) {
            return ramRoleName(Output.of(ramRoleName));
        }

        /**
         * @param resourceGroupId The Id of resource group which the instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(@Nullable Output<String> resourceGroupId) {
            $.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * @param resourceGroupId The Id of resource group which the instance belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupId(String resourceGroupId) {
            return resourceGroupId(Output.of(resourceGroupId));
        }

        /**
         * @param status Instance status. Valid values: &#34;Creating&#34;, &#34;Starting&#34;, &#34;Running&#34;, &#34;Stopping&#34; and &#34;Stopped&#34;. If undefined, all statuses are considered.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Instance status. Valid values: &#34;Creating&#34;, &#34;Starting&#34;, &#34;Running&#34;, &#34;Stopping&#34; and &#34;Stopped&#34;. If undefined, all statuses are considered.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags A map of tags assigned to the ECS instances. It must be in the format:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.alicloud.ecs.EcsFunctions;
         * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         final var taggedInstances = EcsFunctions.getInstances(GetInstancesArgs.builder()
         *             .tags(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the ECS instances. It must be in the format:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import com.pulumi.alicloud.ecs.EcsFunctions;
         * import com.pulumi.alicloud.actiontrail.inputs.GetInstancesArgs;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *         final var taggedInstances = EcsFunctions.getInstances(GetInstancesArgs.builder()
         *             .tags(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
         *             .build());
         * 
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vpcId ID of the VPC linked to the instances.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId ID of the VPC linked to the instances.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        /**
         * @param vswitchId ID of the VSwitch linked to the instances.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(@Nullable Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        /**
         * @param vswitchId ID of the VSwitch linked to the instances.
         * 
         * @return builder
         * 
         */
        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public GetInstancesArgs build() {
            return $;
        }
    }

}