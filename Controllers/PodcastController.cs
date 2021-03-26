using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Spoilers_API.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class PodcastController : Controller
    {
        private static readonly string[] Summaries = new[]
        {
            "Primo Episodio", "Secondo", "Terzo", "Quarto", "Quinto", 
        };

        private static readonly int[] Episode = new[]
        {
            1,2,3,4,5
        };

        private readonly ILogger<PodcastController> _logger;

        public PodcastController(ILogger<PodcastController> logger)
        {
            _logger = logger;
        }


        [HttpGet]
        public IEnumerable<PodcastData> Get()
        {
            return Enumerable.Range(0, 5).Select(index => new PodcastData
            {
                Episodes = Episode[index],
                Summary = Summaries[index]
            })
            .ToArray();
        }
    }
}
