// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ocean;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesArgs;
import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesPlainArgs;
import com.pulumi.alicloud.ocean.outputs.GetBaseInstancesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OceanFunctions {
    /**
     * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.203.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ocean.OceanFunctions;
     * import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesArgs;
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
     *         final var ids = OceanFunctions.getBaseInstances();
     * 
     *         ctx.export(&#34;oceanBaseInstanceId1&#34;, ids.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *         final var nameRegex = OceanFunctions.getBaseInstances(GetBaseInstancesArgs.builder()
     *             .nameRegex(&#34;^my-Instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;oceanBaseInstanceId2&#34;, nameRegex.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetBaseInstancesResult> getBaseInstances() {
        return getBaseInstances(GetBaseInstancesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.203.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ocean.OceanFunctions;
     * import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesArgs;
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
     *         final var ids = OceanFunctions.getBaseInstances();
     * 
     *         ctx.export(&#34;oceanBaseInstanceId1&#34;, ids.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *         final var nameRegex = OceanFunctions.getBaseInstances(GetBaseInstancesArgs.builder()
     *             .nameRegex(&#34;^my-Instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;oceanBaseInstanceId2&#34;, nameRegex.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBaseInstancesResult> getBaseInstancesPlain() {
        return getBaseInstancesPlain(GetBaseInstancesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.203.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ocean.OceanFunctions;
     * import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesArgs;
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
     *         final var ids = OceanFunctions.getBaseInstances();
     * 
     *         ctx.export(&#34;oceanBaseInstanceId1&#34;, ids.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *         final var nameRegex = OceanFunctions.getBaseInstances(GetBaseInstancesArgs.builder()
     *             .nameRegex(&#34;^my-Instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;oceanBaseInstanceId2&#34;, nameRegex.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetBaseInstancesResult> getBaseInstances(GetBaseInstancesArgs args) {
        return getBaseInstances(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.203.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ocean.OceanFunctions;
     * import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesArgs;
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
     *         final var ids = OceanFunctions.getBaseInstances();
     * 
     *         ctx.export(&#34;oceanBaseInstanceId1&#34;, ids.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *         final var nameRegex = OceanFunctions.getBaseInstances(GetBaseInstancesArgs.builder()
     *             .nameRegex(&#34;^my-Instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;oceanBaseInstanceId2&#34;, nameRegex.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBaseInstancesResult> getBaseInstancesPlain(GetBaseInstancesPlainArgs args) {
        return getBaseInstancesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.203.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ocean.OceanFunctions;
     * import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesArgs;
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
     *         final var ids = OceanFunctions.getBaseInstances();
     * 
     *         ctx.export(&#34;oceanBaseInstanceId1&#34;, ids.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *         final var nameRegex = OceanFunctions.getBaseInstances(GetBaseInstancesArgs.builder()
     *             .nameRegex(&#34;^my-Instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;oceanBaseInstanceId2&#34;, nameRegex.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetBaseInstancesResult> getBaseInstances(GetBaseInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ocean/getBaseInstances:getBaseInstances", TypeShape.of(GetBaseInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.203.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.ocean.OceanFunctions;
     * import com.pulumi.alicloud.ocean.inputs.GetBaseInstancesArgs;
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
     *         final var ids = OceanFunctions.getBaseInstances();
     * 
     *         ctx.export(&#34;oceanBaseInstanceId1&#34;, ids.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *         final var nameRegex = OceanFunctions.getBaseInstances(GetBaseInstancesArgs.builder()
     *             .nameRegex(&#34;^my-Instance&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;oceanBaseInstanceId2&#34;, nameRegex.applyValue(getBaseInstancesResult -&gt; getBaseInstancesResult.instances()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetBaseInstancesResult> getBaseInstancesPlain(GetBaseInstancesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ocean/getBaseInstances:getBaseInstances", TypeShape.of(GetBaseInstancesResult.class), args, Utilities.withVersion(options));
    }
}