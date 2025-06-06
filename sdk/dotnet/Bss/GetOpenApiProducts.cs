// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Bss
{
    public static class GetOpenApiProducts
    {
        /// <summary>
        /// This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
        /// 
        /// &gt; **NOTE:** Available since v1.195.0.
        /// </summary>
        public static Task<GetOpenApiProductsResult> InvokeAsync(GetOpenApiProductsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOpenApiProductsResult>("alicloud:bss/getOpenApiProducts:getOpenApiProducts", args ?? new GetOpenApiProductsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
        /// 
        /// &gt; **NOTE:** Available since v1.195.0.
        /// </summary>
        public static Output<GetOpenApiProductsResult> Invoke(GetOpenApiProductsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOpenApiProductsResult>("alicloud:bss/getOpenApiProducts:getOpenApiProducts", args ?? new GetOpenApiProductsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Bss Open Api Product available to the user.[What is Product](https://www.alibabacloud.com/help/en/boa/latest/api-bssopenapi-2017-12-14-queryproductlist)
        /// 
        /// &gt; **NOTE:** Available since v1.195.0.
        /// </summary>
        public static Output<GetOpenApiProductsResult> Invoke(GetOpenApiProductsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetOpenApiProductsResult>("alicloud:bss/getOpenApiProducts:getOpenApiProducts", args ?? new GetOpenApiProductsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOpenApiProductsArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of product IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Product name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetOpenApiProductsArgs()
        {
        }
        public static new GetOpenApiProductsArgs Empty => new GetOpenApiProductsArgs();
    }

    public sealed class GetOpenApiProductsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of product IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Product name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetOpenApiProductsInvokeArgs()
        {
        }
        public static new GetOpenApiProductsInvokeArgs Empty => new GetOpenApiProductsInvokeArgs();
    }


    [OutputType]
    public sealed class GetOpenApiProductsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of Products.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of Product Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetOpenApiProductsProductResult> Products;

        [OutputConstructor]
        private GetOpenApiProductsResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetOpenApiProductsProductResult> products)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Products = products;
        }
    }
}
