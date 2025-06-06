// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.gwlb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
import com.pulumi.alicloud.gwlb.inputs.GetZonesPlainArgs;
import com.pulumi.alicloud.gwlb.outputs.GetZonesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.deployment.InvokeOutputOptions;
import java.util.concurrent.CompletableFuture;

public final class GwlbFunctions {
    /**
     * This data source provides Gwlb Zone available to the user.[What is Zone](https://www.alibabacloud.com/help/en/)
     * 
     * &gt; **NOTE:** Available since v1.236.0.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gwlb.GwlbFunctions;
     * import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
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
     *         final var default = GwlbFunctions.getZones(GetZonesArgs.builder()
     *             .build());
     * 
     *         ctx.export("alicloudGwlbZoneExampleId", default_.zones()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetZonesResult> getZones() {
        return getZones(GetZonesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Gwlb Zone available to the user.[What is Zone](https://www.alibabacloud.com/help/en/)
     * 
     * &gt; **NOTE:** Available since v1.236.0.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gwlb.GwlbFunctions;
     * import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
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
     *         final var default = GwlbFunctions.getZones(GetZonesArgs.builder()
     *             .build());
     * 
     *         ctx.export("alicloudGwlbZoneExampleId", default_.zones()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain() {
        return getZonesPlain(GetZonesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides Gwlb Zone available to the user.[What is Zone](https://www.alibabacloud.com/help/en/)
     * 
     * &gt; **NOTE:** Available since v1.236.0.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gwlb.GwlbFunctions;
     * import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
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
     *         final var default = GwlbFunctions.getZones(GetZonesArgs.builder()
     *             .build());
     * 
     *         ctx.export("alicloudGwlbZoneExampleId", default_.zones()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetZonesResult> getZones(GetZonesArgs args) {
        return getZones(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Gwlb Zone available to the user.[What is Zone](https://www.alibabacloud.com/help/en/)
     * 
     * &gt; **NOTE:** Available since v1.236.0.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gwlb.GwlbFunctions;
     * import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
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
     *         final var default = GwlbFunctions.getZones(GetZonesArgs.builder()
     *             .build());
     * 
     *         ctx.export("alicloudGwlbZoneExampleId", default_.zones()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain(GetZonesPlainArgs args) {
        return getZonesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides Gwlb Zone available to the user.[What is Zone](https://www.alibabacloud.com/help/en/)
     * 
     * &gt; **NOTE:** Available since v1.236.0.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gwlb.GwlbFunctions;
     * import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
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
     *         final var default = GwlbFunctions.getZones(GetZonesArgs.builder()
     *             .build());
     * 
     *         ctx.export("alicloudGwlbZoneExampleId", default_.zones()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetZonesResult> getZones(GetZonesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:gwlb/getZones:getZones", TypeShape.of(GetZonesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Gwlb Zone available to the user.[What is Zone](https://www.alibabacloud.com/help/en/)
     * 
     * &gt; **NOTE:** Available since v1.236.0.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gwlb.GwlbFunctions;
     * import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
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
     *         final var default = GwlbFunctions.getZones(GetZonesArgs.builder()
     *             .build());
     * 
     *         ctx.export("alicloudGwlbZoneExampleId", default_.zones()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static Output<GetZonesResult> getZones(GetZonesArgs args, InvokeOutputOptions options) {
        return Deployment.getInstance().invoke("alicloud:gwlb/getZones:getZones", TypeShape.of(GetZonesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides Gwlb Zone available to the user.[What is Zone](https://www.alibabacloud.com/help/en/)
     * 
     * &gt; **NOTE:** Available since v1.236.0.
     * 
     * ## Example Usage
     * 
     * &lt;!--Start PulumiCodeChooser --&gt;
     * <pre>
     * {@code
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.gwlb.GwlbFunctions;
     * import com.pulumi.alicloud.gwlb.inputs.GetZonesArgs;
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
     *         final var default = GwlbFunctions.getZones(GetZonesArgs.builder()
     *             .build());
     * 
     *         ctx.export("alicloudGwlbZoneExampleId", default_.zones()[0].id());
     *     }
     * }
     * }
     * </pre>
     * &lt;!--End PulumiCodeChooser --&gt;
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain(GetZonesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:gwlb/getZones:getZones", TypeShape.of(GetZonesResult.class), args, Utilities.withVersion(options));
    }
}
