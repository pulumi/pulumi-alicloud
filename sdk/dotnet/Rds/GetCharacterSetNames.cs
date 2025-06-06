// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static class GetCharacterSetNames
    {
        /// <summary>
        /// This data source is the character set supported by querying RDS instances.
        /// 
        /// &gt; **NOTE:** Available in v1.198.0+.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Declare the data source
        ///     var names = AliCloud.Rds.GetCharacterSetNames.Invoke(new()
        ///     {
        ///         Engine = "MySQL",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRdsCharacterSetNames"] = names.Apply(getCharacterSetNamesResult =&gt; getCharacterSetNamesResult.Names[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetCharacterSetNamesResult> InvokeAsync(GetCharacterSetNamesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCharacterSetNamesResult>("alicloud:rds/getCharacterSetNames:getCharacterSetNames", args ?? new GetCharacterSetNamesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source is the character set supported by querying RDS instances.
        /// 
        /// &gt; **NOTE:** Available in v1.198.0+.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Declare the data source
        ///     var names = AliCloud.Rds.GetCharacterSetNames.Invoke(new()
        ///     {
        ///         Engine = "MySQL",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRdsCharacterSetNames"] = names.Apply(getCharacterSetNamesResult =&gt; getCharacterSetNamesResult.Names[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCharacterSetNamesResult> Invoke(GetCharacterSetNamesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCharacterSetNamesResult>("alicloud:rds/getCharacterSetNames:getCharacterSetNames", args ?? new GetCharacterSetNamesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source is the character set supported by querying RDS instances.
        /// 
        /// &gt; **NOTE:** Available in v1.198.0+.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Declare the data source
        ///     var names = AliCloud.Rds.GetCharacterSetNames.Invoke(new()
        ///     {
        ///         Engine = "MySQL",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstRdsCharacterSetNames"] = names.Apply(getCharacterSetNamesResult =&gt; getCharacterSetNamesResult.Names[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetCharacterSetNamesResult> Invoke(GetCharacterSetNamesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetCharacterSetNamesResult>("alicloud:rds/getCharacterSetNames:getCharacterSetNames", args ?? new GetCharacterSetNamesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCharacterSetNamesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`.
        /// </summary>
        [Input("engine", required: true)]
        public string Engine { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetCharacterSetNamesArgs()
        {
        }
        public static new GetCharacterSetNamesArgs Empty => new GetCharacterSetNamesArgs();
    }

    public sealed class GetCharacterSetNamesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Database type. Options are `MySQL`, `SQLServer`, `PostgreSQL`, `MariaDB`.
        /// </summary>
        [Input("engine", required: true)]
        public Input<string> Engine { get; set; } = null!;

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetCharacterSetNamesInvokeArgs()
        {
        }
        public static new GetCharacterSetNamesInvokeArgs Empty => new GetCharacterSetNamesInvokeArgs();
    }


    [OutputType]
    public sealed class GetCharacterSetNamesResult
    {
        public readonly string Engine;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetCharacterSetNamesResult(
            string engine,

            string id,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Engine = engine;
            Id = id;
            Names = names;
            OutputFile = outputFile;
        }
    }
}
