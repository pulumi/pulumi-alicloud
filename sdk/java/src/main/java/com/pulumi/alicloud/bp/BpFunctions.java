// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.bp;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsArgs;
import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsPlainArgs;
import com.pulumi.alicloud.bp.outputs.GetStudioApplicationsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class BpFunctions {
    /**
     * This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.192.0+.
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
     * import com.pulumi.alicloud.bp.BpFunctions;
     * import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsArgs;
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
     *         final var ids = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .ids(&#34;example_id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId1&#34;, ids.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *         final var nameRegex = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .nameRegex(&#34;^my-Application&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId2&#34;, nameRegex.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetStudioApplicationsResult> getStudioApplications() {
        return getStudioApplications(GetStudioApplicationsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.192.0+.
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
     * import com.pulumi.alicloud.bp.BpFunctions;
     * import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsArgs;
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
     *         final var ids = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .ids(&#34;example_id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId1&#34;, ids.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *         final var nameRegex = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .nameRegex(&#34;^my-Application&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId2&#34;, nameRegex.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStudioApplicationsResult> getStudioApplicationsPlain() {
        return getStudioApplicationsPlain(GetStudioApplicationsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.192.0+.
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
     * import com.pulumi.alicloud.bp.BpFunctions;
     * import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsArgs;
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
     *         final var ids = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .ids(&#34;example_id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId1&#34;, ids.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *         final var nameRegex = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .nameRegex(&#34;^my-Application&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId2&#34;, nameRegex.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetStudioApplicationsResult> getStudioApplications(GetStudioApplicationsArgs args) {
        return getStudioApplications(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.192.0+.
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
     * import com.pulumi.alicloud.bp.BpFunctions;
     * import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsArgs;
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
     *         final var ids = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .ids(&#34;example_id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId1&#34;, ids.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *         final var nameRegex = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .nameRegex(&#34;^my-Application&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId2&#34;, nameRegex.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStudioApplicationsResult> getStudioApplicationsPlain(GetStudioApplicationsPlainArgs args) {
        return getStudioApplicationsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.192.0+.
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
     * import com.pulumi.alicloud.bp.BpFunctions;
     * import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsArgs;
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
     *         final var ids = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .ids(&#34;example_id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId1&#34;, ids.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *         final var nameRegex = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .nameRegex(&#34;^my-Application&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId2&#34;, nameRegex.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetStudioApplicationsResult> getStudioApplications(GetStudioApplicationsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:bp/getStudioApplications:getStudioApplications", TypeShape.of(GetStudioApplicationsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Cloud Architect Design Tools (BPStudio) Applications of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.192.0+.
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
     * import com.pulumi.alicloud.bp.BpFunctions;
     * import com.pulumi.alicloud.bp.inputs.GetStudioApplicationsArgs;
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
     *         final var ids = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .ids(&#34;example_id&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId1&#34;, ids.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *         final var nameRegex = BpFunctions.getStudioApplications(GetStudioApplicationsArgs.builder()
     *             .nameRegex(&#34;^my-Application&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;bpStudioApplicationId2&#34;, nameRegex.applyValue(getStudioApplicationsResult -&gt; getStudioApplicationsResult.applications()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetStudioApplicationsResult> getStudioApplicationsPlain(GetStudioApplicationsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:bp/getStudioApplications:getStudioApplications", TypeShape.of(GetStudioApplicationsResult.class), args, Utilities.withVersion(options));
    }
}