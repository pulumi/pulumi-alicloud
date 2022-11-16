// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.adb;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.adb.inputs.GetClustersArgs;
import com.pulumi.alicloud.adb.inputs.GetClustersPlainArgs;
import com.pulumi.alicloud.adb.inputs.GetDBClustersArgs;
import com.pulumi.alicloud.adb.inputs.GetDBClustersPlainArgs;
import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
import com.pulumi.alicloud.adb.inputs.GetZonesPlainArgs;
import com.pulumi.alicloud.adb.outputs.GetClustersResult;
import com.pulumi.alicloud.adb.outputs.GetDBClustersResult;
import com.pulumi.alicloud.adb.outputs.GetZonesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class AdbFunctions {
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetClustersArgs;
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
     *         final var adbClustersDs = AdbFunctions.getClusters(GetClustersArgs.builder()
     *             .descriptionRegex(&#34;am-\\w+&#34;)
     *             .status(&#34;Running&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbClusterId&#34;, adbClustersDs.applyValue(getClustersResult -&gt; getClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClustersResult> getClusters() {
        return getClusters(GetClustersArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetClustersArgs;
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
     *         final var adbClustersDs = AdbFunctions.getClusters(GetClustersArgs.builder()
     *             .descriptionRegex(&#34;am-\\w+&#34;)
     *             .status(&#34;Running&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbClusterId&#34;, adbClustersDs.applyValue(getClustersResult -&gt; getClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClustersResult> getClustersPlain() {
        return getClustersPlain(GetClustersPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetClustersArgs;
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
     *         final var adbClustersDs = AdbFunctions.getClusters(GetClustersArgs.builder()
     *             .descriptionRegex(&#34;am-\\w+&#34;)
     *             .status(&#34;Running&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbClusterId&#34;, adbClustersDs.applyValue(getClustersResult -&gt; getClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClustersResult> getClusters(GetClustersArgs args) {
        return getClusters(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetClustersArgs;
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
     *         final var adbClustersDs = AdbFunctions.getClusters(GetClustersArgs.builder()
     *             .descriptionRegex(&#34;am-\\w+&#34;)
     *             .status(&#34;Running&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbClusterId&#34;, adbClustersDs.applyValue(getClustersResult -&gt; getClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClustersResult> getClustersPlain(GetClustersPlainArgs args) {
        return getClustersPlain(args, InvokeOptions.Empty);
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetClustersArgs;
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
     *         final var adbClustersDs = AdbFunctions.getClusters(GetClustersArgs.builder()
     *             .descriptionRegex(&#34;am-\\w+&#34;)
     *             .status(&#34;Running&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbClusterId&#34;, adbClustersDs.applyValue(getClustersResult -&gt; getClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetClustersResult> getClusters(GetClustersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:adb/getClusters:getClusters", TypeShape.of(GetClustersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetClustersArgs;
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
     *         final var adbClustersDs = AdbFunctions.getClusters(GetClustersArgs.builder()
     *             .descriptionRegex(&#34;am-\\w+&#34;)
     *             .status(&#34;Running&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbClusterId&#34;, adbClustersDs.applyValue(getClustersResult -&gt; getClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetClustersResult> getClustersPlain(GetClustersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:adb/getClusters:getClusters", TypeShape.of(GetClustersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Adb DBClusters of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.121.0+.
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
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetDBClustersArgs;
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
     *         final var example = AdbFunctions.getDBClusters(GetDBClustersArgs.builder()
     *             .descriptionRegex(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbDbClusterId&#34;, example.applyValue(getDBClustersResult -&gt; getDBClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDBClustersResult> getDBClusters() {
        return getDBClusters(GetDBClustersArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Adb DBClusters of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.121.0+.
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
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetDBClustersArgs;
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
     *         final var example = AdbFunctions.getDBClusters(GetDBClustersArgs.builder()
     *             .descriptionRegex(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbDbClusterId&#34;, example.applyValue(getDBClustersResult -&gt; getDBClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDBClustersResult> getDBClustersPlain() {
        return getDBClustersPlain(GetDBClustersPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Adb DBClusters of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.121.0+.
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
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetDBClustersArgs;
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
     *         final var example = AdbFunctions.getDBClusters(GetDBClustersArgs.builder()
     *             .descriptionRegex(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbDbClusterId&#34;, example.applyValue(getDBClustersResult -&gt; getDBClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDBClustersResult> getDBClusters(GetDBClustersArgs args) {
        return getDBClusters(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Adb DBClusters of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.121.0+.
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
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetDBClustersArgs;
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
     *         final var example = AdbFunctions.getDBClusters(GetDBClustersArgs.builder()
     *             .descriptionRegex(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbDbClusterId&#34;, example.applyValue(getDBClustersResult -&gt; getDBClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDBClustersResult> getDBClustersPlain(GetDBClustersPlainArgs args) {
        return getDBClustersPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Adb DBClusters of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.121.0+.
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
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetDBClustersArgs;
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
     *         final var example = AdbFunctions.getDBClusters(GetDBClustersArgs.builder()
     *             .descriptionRegex(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbDbClusterId&#34;, example.applyValue(getDBClustersResult -&gt; getDBClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDBClustersResult> getDBClusters(GetDBClustersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:adb/getDBClusters:getDBClusters", TypeShape.of(GetDBClustersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Adb DBClusters of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.121.0+.
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
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetDBClustersArgs;
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
     *         final var example = AdbFunctions.getDBClusters(GetDBClustersArgs.builder()
     *             .descriptionRegex(&#34;example&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstAdbDbClusterId&#34;, example.applyValue(getDBClustersResult -&gt; getDBClustersResult.clusters()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDBClustersResult> getDBClustersPlain(GetDBClustersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:adb/getDBClusters:getDBClusters", TypeShape.of(GetDBClustersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides availability zones for ADB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
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
     *         final var zonesIds = AdbFunctions.getZones();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetZonesResult> getZones() {
        return getZones(GetZonesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for ADB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
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
     *         final var zonesIds = AdbFunctions.getZones();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain() {
        return getZonesPlain(GetZonesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for ADB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
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
     *         final var zonesIds = AdbFunctions.getZones();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetZonesResult> getZones(GetZonesArgs args) {
        return getZones(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for ADB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
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
     *         final var zonesIds = AdbFunctions.getZones();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain(GetZonesPlainArgs args) {
        return getZonesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides availability zones for ADB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
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
     *         final var zonesIds = AdbFunctions.getZones();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetZonesResult> getZones(GetZonesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:adb/getZones:getZones", TypeShape.of(GetZonesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides availability zones for ADB that can be accessed by an Alibaba Cloud account within the region configured in the provider.
     * 
     * &gt; **NOTE:** Available in v1.73.0+.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.adb.AdbFunctions;
     * import com.pulumi.alicloud.adb.inputs.GetZonesArgs;
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
     *         final var zonesIds = AdbFunctions.getZones();
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetZonesResult> getZonesPlain(GetZonesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:adb/getZones:getZones", TypeShape.of(GetZonesResult.class), args, Utilities.withVersion(options));
    }
}